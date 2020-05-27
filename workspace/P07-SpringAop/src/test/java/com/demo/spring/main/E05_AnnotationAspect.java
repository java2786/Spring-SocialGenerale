package com.demo.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmployeeService;

public class E05_AnnotationAspect {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_Aspect05.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		// Employee.setName() method has Loggable annotation
		employeeService.getEmployee().setName("Carl Mark");
	}

}
