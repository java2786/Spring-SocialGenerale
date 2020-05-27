package com.demo.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspect02_EmployeeAspectPointcut {

	@Pointcut("execution(public String getName())")
	public void getNamePointcut(){}
	
	@Before("getNamePointcut()")
	public void loggingAdvice(){
		System.out.println("Executing loggingAdvice on getName()");
	}
	
	@Before("getNamePointcut()")
	public void transactionAdvice(){
		System.out.println("Executing transactionAdvice on getName()");
	}
	
	
	@Before("allServicePackageMethodsPointcut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Before executing methods withing service package");
	}
	
//	@Pointcut("execution(* * com.demo.spring.service.*.*(..))")
	@Pointcut("within(com.demo.spring.service.*)")
	public void allServicePackageMethodsPointcut(){}

}
