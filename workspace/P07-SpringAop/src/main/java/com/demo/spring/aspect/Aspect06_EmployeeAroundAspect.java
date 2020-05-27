package com.demo.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Aspect06_EmployeeAroundAspect {

	@Around("execution(* com.demo.spring.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object value = null;
		try {
			System.out.println("Before invoking getName() method");
			value = proceedingJoinPoint.proceed();
			System.out.println("After invoking getName() method. Return value = " + value);
		} catch (Throwable e) {
			System.out.println("Exception when invoking getName() method " + e);
//			e.printStackTrace();
		}
		return value;
	}
}
