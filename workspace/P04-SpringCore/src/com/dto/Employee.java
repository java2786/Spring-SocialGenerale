package com.dto;

public class Employee extends Person1{
	private double salary;
	private int workExperience;
	private String dept;
	
	public void init(){
		System.out.println("Bean is going through init: "+this);
	}
	public void destroy(){
		System.out.println("Bean will destroy now: "+this);
	}
		
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name="+super.getName()+" age="+super.getAge()+" salary=" + this.getSalary() + ", workExperience="
				+ this.getWorkExperience() + " dept="+this.getDept()+"]";
	}
	
}
