package com.qingdong.example.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qingdong.example.springin10steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn10StepsScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);
	
	public static void main(String[] args) {
		//BinarySearchImpl search = new BinarySearchImpl(new QuickSort());
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsScopeApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		logger.info("{}", personDAO);
		logger.info("{}", personDAO.getJdbcConnection());
		logger.info("{}", personDAO2);
		logger.info("{}", personDAO2.getJdbcConnection());
		
		
	}

}
