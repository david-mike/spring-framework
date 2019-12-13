package com.qingdong.example.springin10steps.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("Jdbc Connection.");
	}

}
