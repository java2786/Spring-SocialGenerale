package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Course;

public class E10_CollectionsWithSpring {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-10-collection.xml");
		Course bean = context.getBean("course", Course.class);
		System.out.println(bean);
	}
}
