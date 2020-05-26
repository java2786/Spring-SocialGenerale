package com.dto;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {
	
	private String name;
	private int age;
	private Date dob;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterPropertiesSet: "+this);
	}
	@Override
	public void destroy() {
		System.out.println("DestroyingBean: "+this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}

	
}
