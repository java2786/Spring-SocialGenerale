package com.demo.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect03_EmployeeAspectJoinPoint {
	
	@Before("args(nameArg)")
	public void logStringArguments(String nameArg){
		System.out.println("String argument passed = " + nameArg);
	}

	@Before("execution(public void com.demo.spring.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before running loggingAdvice on method="+joinPoint.toString());
		System.out.println("Agruments Passed = " + Arrays.toString(joinPoint.getArgs()));
	}

}
