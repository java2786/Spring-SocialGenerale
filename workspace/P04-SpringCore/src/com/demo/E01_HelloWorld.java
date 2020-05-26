package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.dto.Message;

public class E01_HelloWorld {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(System.getProperty("user.dir")+"/src/spring.xml"));

		Message bean = (Message) factory.getBean("msg");
		System.out.println(bean);
	}

}
