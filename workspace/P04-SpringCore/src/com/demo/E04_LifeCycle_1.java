package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Person;

public class E04_LifeCycle_1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-04-life-cycle.xml");

		Person bean = context.getBean("personBean", Person.class);
		System.out.println(bean);
		bean = null;
		
//		close() method is defined by ConfigurableApplicationContext
		((ConfigurableApplicationContext) context).close();
		
//		BeanFactory not initialized or already closed
//		((ConfigurableApplicationContext) context).refresh();
		Person newBean = context.getBean("personBean", Person.class);
		System.out.println(newBean);
		
		
		// registers context to shutdown 
//		((ConfigurableApplicationContext) context).registerShutdownHook();
		
	}

}
