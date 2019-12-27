package com.SpringLearning.Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringLearning.Spring.basic.BinarySearchImpl;
import com.SpringLearning.Spring.scope.PersonDataAccessObject;

@SpringBootApplication
public class ScopeApplication {
	
	private static Logger LOGGER = 
			LoggerFactory.getLogger(ScopeApplication.class);
	
	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
		
		PersonDataAccessObject personDAO = applicationContext.getBean(PersonDataAccessObject.class);
		PersonDataAccessObject personDAO2 = applicationContext.getBean(PersonDataAccessObject.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}

}
