package com.demo.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.Person1;

public class E11_ImportMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(E11_Import.class);
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		boolean databaseConnection = context.getBean(Boolean.class);
		System.out.println(databaseConnection);
	}
}
