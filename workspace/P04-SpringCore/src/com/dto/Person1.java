package com.dto;

public class Person1  {
	
	private String name;
	private int age;
	
	public void init() {
		System.out.println("Init AfterPropertiesSet: "+this);
	}

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

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
}
