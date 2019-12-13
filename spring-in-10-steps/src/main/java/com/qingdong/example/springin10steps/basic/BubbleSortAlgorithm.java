package com.qingdong.example.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	

	@Override
	public void sort(int[] input) {
		// TODO Auto-generated method stub
		// Sort the input array using Bubble sort
		System.out.println("bubble1 sort");
	}
	
}
