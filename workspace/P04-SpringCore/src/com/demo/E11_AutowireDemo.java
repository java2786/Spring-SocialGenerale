package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Book;
import com.dto.Library;

public class E11_AutowireDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-11-autowire.xml");
		
		prev(context);
		
		
	}

	private static void prev(ApplicationContext context) {
		Library library = context.getBean("library3", Library.class);
		System.out.println(library);
		
		Book book = context.getBean(Book.class);
//		System.out.println(book);
		
		
		
		
//		beanByName = context.getBean("libraryByType", Library.class);
//		beanByName = context.getBean("libraryByConstructor", Library.class);
	}
}
