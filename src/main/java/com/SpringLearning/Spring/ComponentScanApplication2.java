package com.SpringLearning.Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpringLearning.Spring.basic.BinarySearchImpl;
import com.SpringLearning.Spring.scope.PersonDataAccessObject;
import com.SpringLearning.componentscan.ComponentPersonDataAccessObject;

@SpringBootApplication
@ComponentScan({"com.SpringLearning.Spring","com.SpringLearning.componentscan"}) // scans both packages and its child packages
public class ComponentScanApplication2 {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(ComponentScanApplication2.class);
	
	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication2.class, args);
		
		ComponentPersonDataAccessObject componentDAO = applicationContext.getBean(ComponentPersonDataAccessObject.class);
		PersonDataAccessObject personDAO = applicationContext.getBean(PersonDataAccessObject.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", personDAO);



	}

}
