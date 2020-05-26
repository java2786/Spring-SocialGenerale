package com.demo.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.Company;

public class E08_DiMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(E08_DI.class);
		Company bean = context.getBean(Company.class);
		System.out.println(bean);
	}
}
