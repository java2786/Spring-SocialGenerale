package com.demo.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.dto.Employee;

public class E06_EmployeePostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("BeforeInit : " + beanName);//emp
		System.out.println("BeforeInit : " + bean);
		if(bean instanceof Employee){
			Employee emp = (Employee) bean;
			emp.setDept("Security");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("AfterInit : " + beanName);//emp
		System.out.println("AfterInit : " + bean);
		return bean;
	}
	
}