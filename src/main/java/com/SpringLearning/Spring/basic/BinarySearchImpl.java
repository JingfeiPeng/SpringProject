package com.SpringLearning.Spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // instantiate new instance of this bean whenever getting from spring
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlg;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}


	public int binarySearch(int[] arr, int numberToSearch) {
		
		int[] sortedNumbers = sortAlg.sort(arr);
		System.out.println("sort Algorithm is: "+sortAlg);
		
		int n = sortedNumbers.length; 
        int result = search(sortedNumbers, 0, n - 1, numberToSearch); 

		return result;
	}
	
	public int search(int arr[], int l, int r, int x) {
		if (r >= 1) {
			int mid =  l + (r-1)/2;
			if (arr[mid] == x)
				return mid;
			
			if (arr[mid] > x)
				return search(arr, l, mid - 1, x);
			
			return search(arr, mid+1, r, x);
		}
		
		return -1; // not present
	}
	
}
