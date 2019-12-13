package com.qingdong.example.springin10steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public void sort(int[] input) {
		// TODO Auto-generated method stub
		// Sort the input array using Quick sort
		System.out.println("Quick1 sort");
		
	}

}
