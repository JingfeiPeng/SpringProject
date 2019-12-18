package com.SpringLearning.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] arr, int numberToSearch) {
		
		int[] sortedNumbers = sortAlgorithm.sort(arr);
		System.out.println(sortAlgorithm);
		
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
