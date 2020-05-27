package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.entities.Employee;
import com.demo.entities.Phone;
import com.demo.service.EmployeeService;

public class TestJpa {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService service = context.getBean(EmployeeService.class);
		
		Employee emp = new Employee();
		emp.setFirstName("Mark");
		emp.setLastName("Carl");
		emp.setEmail("xyz@gmail.com");
		
		Phone phone = new Phone();
		phone.setNumber("9696969696");
		phone.setEmployee(emp);

		List<Phone> phones = new ArrayList();
		phones.add(phone);
		emp.setPhones(phones);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("Arun");
		emp2.setLastName("Kumar");
		emp2.setEmail("abc@gmail.com");
		
		create(service, emp);
//		create(service, emp2);
		
//		readOne(service);
		
//		update(service);
		
//		delete(service);
		
		readAll(service);
		
		
	}


	private static void delete(EmployeeService service) {
		service.delete(2);
	}

	private static void update(EmployeeService service) {
		service.update(1, "Miley");
	}

	private static void readOne(EmployeeService service) {
		Employee savedEmp = service.readOne(2);
		System.out.println(savedEmp);
	}

	private static void readAll(EmployeeService service) {
		List<Employee> list = service.readAll();
		System.out.println(list);
	}

	private static void create(EmployeeService service, Employee emp) {
		service.create(emp);
	}
}
