package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Manager;

public class E07_InheritanceConfig {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-07-inheritance.xml");
		Manager bean = context.getBean("manager", Manager.class);
		System.out.println(bean);
	}
}
