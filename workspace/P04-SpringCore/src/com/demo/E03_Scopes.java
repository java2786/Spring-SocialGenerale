package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Message;

public class E03_Scopes {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-03-scope.xml");
		System.out.println(context.isSingleton("msgSingleton"));
		System.out.println(context.isPrototype("msgPrototype"));
		
		Message bean1 = (Message) context.getBean("msgSingleton");
		Message bean2 = (Message) context.getBean("msgSingleton");
		
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1 == bean2);
		bean1.setMessage("Singleton bean says, HelloWorld !");
		System.out.println(bean1);
		System.out.println(bean2);
		
		Message bean3 = (Message) context.getBean("msgPrototype");
		Message bean4 = (Message) context.getBean("msgPrototype");
		System.out.println(bean3);
		System.out.println(bean4);
		System.out.println(bean3 == bean4);
		bean3.setMessage("Protypte bean says, HelloWorld !");
		System.out.println(bean3);
		System.out.println(bean4);


	}
}
