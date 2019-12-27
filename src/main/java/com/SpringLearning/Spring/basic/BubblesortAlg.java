package com.SpringLearning.Spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubblesortAlg implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		// logic for bubble sort
		return numbers;
	}
}
