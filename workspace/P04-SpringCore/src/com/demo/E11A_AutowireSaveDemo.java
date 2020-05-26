package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Book;
import com.dto.Library;

public class E11A_AutowireSaveDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-11-autowire_save.xml");
		
		Library library = context.getBean("libraryByName2", Library.class);
		System.out.println(library);
		
	}
}
