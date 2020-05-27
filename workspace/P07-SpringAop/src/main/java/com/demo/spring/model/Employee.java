package com.demo.spring.model;

import com.demo.spring.annot.Loggable;

public class Employee {

	private String name;
	
	public String getName() {
		System.out.println("Emp getname");
		return name;
	}

	@Loggable
	public void setName(String name) {
		this.name=name;
	}
	
	public void raiseRuntimeException(String someArg){
		throw new RuntimeException("Some Exception Raised");
	}
	
}
