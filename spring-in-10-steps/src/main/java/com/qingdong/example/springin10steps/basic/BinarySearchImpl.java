package com.qingdong.example.springin10steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * 
 * The default scope of beans in Spring is singleton.
 * 
 * If we use prototype, we will get a new instance of bean.
 * 
 * @Scope("prototype")
 * 
 * 
 * */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	
	/* we can do autoWiring by name
    * the variable SortAlgorithm is named as bubbleSortAlgorithm
    * Spring will look for the class BubbleSortAlgorithm
    * However, be careful. If we provide a constructor, we must use the same name in the parameter of the constructor
    * Because the Spring will always look for a constructor when creating a bean
    * if we use SortAlgorithm sort to initialize the bubbleSortAlgorithm
    * Spring will complain about it: Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans,
    * or using @Qualifier to identify the bean that should be consumed
    * 
    * If multiple methods are used, the precedence is : @Qualifier > @Primary > variable name matching.
    * 
    */
	
	@Autowired
	@Qualifier("bubble")
	SortAlgorithm bubbleSortAlgorithm;
	
	public void setBubbleSort(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}

	public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}
	
	public int search(int[] data, int target) {
		bubbleSortAlgorithm.sort(data);
		// to-do the search logic
		// return a dummy value
		return 3;
	}

}
