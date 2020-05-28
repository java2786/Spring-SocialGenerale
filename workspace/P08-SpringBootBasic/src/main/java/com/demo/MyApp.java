package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		System.out.println("start my spring boot application");
		
		SpringApplication.run(MyApp.class, args);
		
	}
}
