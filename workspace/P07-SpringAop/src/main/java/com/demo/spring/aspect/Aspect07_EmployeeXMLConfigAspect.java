package com.demo.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect07_EmployeeXMLConfigAspect {

	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object value = null;
		System.out.println("EmployeeXMLConfigAspect");
		try {
			System.out.println("\tBefore invoking getName() method");
			value = proceedingJoinPoint.proceed();
			System.out.println("\tAfter invoking getName() method. Return value="+value);
		} catch (Throwable e) {
			System.out.println("\tException when invoking getName() method " + e);
//			e.printStackTrace();
		}
		return value;
	}
}
