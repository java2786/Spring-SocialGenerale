package com.demo.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dto.Company;
import com.dto.Employee;

@Configuration
public class E08_DI {
	@Bean
	public Employee getEmployeeBean(){
		Employee emp = new Employee();
		emp.setName("Mark");
		emp.setAge(35);
		emp.setSalary(40000);
		emp.setWorkExperience(5);
		emp.setDept(null);
		return emp;
	}
	
	@Bean
	public Company getCompanyBean(){
		Company comp = new Company(getEmployeeBean());
		comp.setAddress("New Delhi");		
		return comp;
	}
	
}
