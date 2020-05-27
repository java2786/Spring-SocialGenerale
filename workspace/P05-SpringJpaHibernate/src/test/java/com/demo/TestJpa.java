package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.dao.EmployeeDao;
import com.demo.entities.Employee;

public class TestJpa {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDao dao = context.getBean(EmployeeDao.class);
		
		
		Employee emp = new Employee();
		emp.setFirstName("Arun");
		emp.setLastName("Kumar");
		dao.add(emp);
	}
}
