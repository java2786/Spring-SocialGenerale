package com.dto;

public class Student {
	String stdName;
	Course stdCourse;
	
	
	public Student(String stdName, Course stdCourse) {
		super();
		this.stdName = stdName;
		this.stdCourse = stdCourse;
	}
	
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}
	
	
}
