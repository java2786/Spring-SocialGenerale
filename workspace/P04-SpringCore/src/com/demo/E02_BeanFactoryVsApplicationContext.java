package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.dto.Message;

public class E02_BeanFactoryVsApplicationContext {

	public static void main(String[] args) {
/**
 * 
	ClassPathXmlApplicationContext: 
		Container will look bean configuration XML file in CLASSPATH
 * 
	FileSystemXmlApplicationContext: 
		Need to provide the full path of the XML bean configuration
 * 		
**/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
						   context = new FileSystemXmlApplicationContext(System.getProperty("user.dir")+"/src/spring.xml");
		
		Message contextBean = (Message) context.getBean("msg");
		Message contextBean1 = context.getBean("msg", Message.class);
		System.out.println("Objects from Context container: "+(contextBean == contextBean1));
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(System.getProperty("user.dir")+"/src/spring.xml"));
		Message factoryBean = (Message) factory.getBean("msg");
		Message factoryBean1 = factory.getBean("msg", Message.class);
		System.out.println("Objects from Factory container: "+(factoryBean == factoryBean1));
		
		System.out.println(contextBean);
		System.out.println(factoryBean);
		System.out.println("Context object vs Factory object: "+((contextBean == factoryBean)));
/**
 * The ApplicationContext interface is built on top of the BeanFactory interface. 
 * It adds some extra functionality than BeanFactory such as 
 ** simple integration with Spring's AOP, 
 ** message resource handling (for I18N), 
 ** event propagation, 
 ** WebApplicationContext for web application. 
**/
	}
	
}
