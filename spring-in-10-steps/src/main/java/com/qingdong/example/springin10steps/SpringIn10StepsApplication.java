package com.qingdong.example.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl search = new BinarySearchImpl(new QuickSort());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.search(new int[] {1,2,3,5,6,8}, 2);
		System.out.println(result);

	}

}
