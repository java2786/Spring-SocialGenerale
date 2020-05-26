package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Student;

public class E09_ConstructorBasedDi {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-09-constructorBasedDi.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		Student bean = context.getBean("studentById", Student.class);
		System.out.println(bean);
//		bean = context.getBean("studentByType", Student.class);
//		System.out.println(bean);
//		bean = context.getBean("studentCourseByIndex", Student.class);
//		System.out.println(bean);
	}
}
