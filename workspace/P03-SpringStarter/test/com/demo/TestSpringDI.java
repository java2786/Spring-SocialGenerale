package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Car;

public class TestSpringDI {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.setEngine(new Engine());
//		
//		System.out.println(car);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Container is ready");

		Car car1 = (Car) context.getBean("bmwCar");
		System.out.println(car1);
		
		Car car2 = context.getBean("swiftCar", Car.class);
		System.out.println(car2);
		Car car3 = context.getBean("swiftCar", Car.class);
		System.out.println(car3);
		
		car3.setBrand("123");
		System.out.println(car2);
		System.out.println(car3);
//		
//		((ConfigurableApplicationContext) context).close();
	}
}