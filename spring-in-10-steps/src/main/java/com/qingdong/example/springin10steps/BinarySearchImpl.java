package com.qingdong.example.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	SortAlgorithm sort;
	
	public BinarySearchImpl(SortAlgorithm sort) {
		this.sort = sort;
	}
	
	public int search(int[] data, int target) {
		sort.sort(data);
		// to-do the search logic
		// return a dummy value
		return 3;
	}

}
