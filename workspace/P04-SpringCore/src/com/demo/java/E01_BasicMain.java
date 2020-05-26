package com.demo.java;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.Message;

public class E01_BasicMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(E01_Basic.class);
		Message bean1 = context.getBean(Message.class);
		System.out.println(bean1);
		
	}
}
