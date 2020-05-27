package com.demo.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmployeeService;

public class E04_AfterAspect {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_Aspect04.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		
		String name = employeeService.getEmployee().getName();
//		System.out.println(name);
		
//		employeeService.getEmployee().setName("Carl Mark");
		employeeService.getEmployee().raiseRuntimeException("some args");
	}

}
