package com.demo.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class E11_Config {

	@Bean
	public Boolean databaseConnected(){
		return true;
	}
	
}
