package com.demo.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Aspect04_EmployeeAfterAspect {

	@After("args(name)")
	public void advice02_logStringArguments(String name){
		// will be executed either an exception occurs or not
		System.out.println("AfterAdvice: String argument passed = " + name);
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="returnName")
	public void advice01_getNameReturningAdvice(String returnName){
		System.out.println("AfterReturningAdvice: Returned Name = " + returnName);
	}
	
	@AfterThrowing("within(com.demo.spring.model.Employee)")
	public void advice03_logExceptions(JoinPoint joinPoint){
		// will be executed with raised exception
		System.out.println("AfterThrowingAdvice: Exception thrown in Employee Methods = " + joinPoint.toString());
	}
	
}
