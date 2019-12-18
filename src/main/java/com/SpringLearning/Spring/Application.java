package com.SpringLearning.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	// What are the beans? @Component
	// What are the dependencies of a bean? @autowired
	// Spring scans the package automatically to find all the beans
	
	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result= binarySearch.binarySearch(new int[] {3,4,12} , 12);
		
		System.out.println(result);
	}

}
