package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Person1;

public class E04_LifeCycle_2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-04-life-cycle.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();

/*		Person1 bean = context.getBean("person1Bean", Person1.class);
		System.out.println(bean);
		bean = null;
		
		Person1 newBean = context.getBean("person1Bean", Person1.class);
		System.out.println(newBean);
		
*/		
		
	}

}
