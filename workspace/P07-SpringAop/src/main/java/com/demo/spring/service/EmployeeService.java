package com.demo.spring.service;

import com.demo.spring.model.Employee;

public class EmployeeService {

	private Employee employee;
	
	public Employee getEmployee(){
		// find employee from database
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		// update employee and save updated employee in database
		this.employee=e;
	}
}
