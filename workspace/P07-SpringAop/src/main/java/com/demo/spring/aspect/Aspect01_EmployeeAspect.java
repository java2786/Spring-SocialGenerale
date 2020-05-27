package com.demo.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect01_EmployeeAspect {

	@Before("execution(public String getName())")
	public void allMethodSignatureFromSpringContainerAdvice(){
		System.out.println("allMethodSignatureFromSpringContainerAdvice");
		System.out.println("*********************");
	}
	
	@Before("execution(public String get*())")
	public void allGettersWithPublicModifierAndReturningStringAdvice(){
		System.out.println("allGettersWithPublicModifierAndReturningStringAdvice");
		System.out.println("--------------------");
	}
	@Before("execution(public * get*())")
	public void allGettersWithPublicModifierAndReturningAnythingAdvice(){
		System.out.println("allGettersWithPublicModifierAndReturningAnythingAdvice");
	}
	@Before("execution(* get*())")
	public void allGettersWithAnyModifierAndReturningAnythingAdvice(){
		System.out.println("allGettersWithAnyModifierAndReturningAnythingAdvice");
	}
	@Before("execution(* get*(*))")
	public void allGettersWithAnyModifierAndReturningAnythingWithExactlyOneArgumentAdvice(){
		System.out.println("allGettersWithAnyModifierAndReturningAnythingWithExactlyOneArgumentAdvice");
	}
	@Before("execution(* get*(..))")// can be zero args
	public void allGettersWithAnyModifierAndReturningAnythingWith_N_NumberOfArgumentsAdvice(){
		System.out.println("allGettersWithAnyModifierAndReturningAnythingWith_N_NumberOfArgumentsAdvice");
	}
	@Before("execution(public String com.demo.spring.model.Employee.getName())")
	public void methodFromClassWithModifierAdvice(){
		System.out.println("methodFromClassWithModifierAdvice");
	}
	@Before("execution(public * com.demo.spring.model.Employee.get*())")
	public void allGettersFromClassWithModifierAdvice(){
		System.out.println("allGettersFromClassWithModifierAdvice");
	}
	@Before("execution(* com.demo.spring.service.*.get*())")
	public void allGettersFromAllClassessInsidePackageAdvice(){
		System.out.println("allGettersFromPackageAndSubpackageAdvice");
	}
	@Before("execution(* com.demo.spring.model.**.get*())")
	public void allGettersFromPackageAndSubpackageAdvice(){
		System.out.println("allGettersFromPackageAdvice");
	}
	
}
