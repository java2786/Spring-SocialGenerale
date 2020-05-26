package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Employee;

/**
 * 
	An ApplicationContext automatically detects any beans 
	that are defined with implementation of the 
	BeanPostProcessor interface and 
	registers these beans as post-processors
 * 
 */

public class E06_BeanPostProcessorDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-06-beanPostProcessor.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
	}
}
