package com.demo.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect05_EmployeeAnnotationAspect {

	@Before("@annotation(com.demo.spring.annot.Loggable)")
	public void beforeLoggableAdvice(){
		System.out.println("Executing beforeLoggableAdvice...");
	}
	
	@After("@annotation(com.demo.spring.annot.Loggable)")
	public void afterLoggableAdvice(){
		System.out.println("Executing afterLoggableAdvice...");
	}
	
}
