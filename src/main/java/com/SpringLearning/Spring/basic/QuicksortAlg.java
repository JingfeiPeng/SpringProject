package com.SpringLearning.Spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuicksortAlg implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for quick sort
		return numbers;
	}
}
