package com.demo.test;

import org.hibernate.Session;

import com.demo.enity.Car;
import com.demo.enity.Engine;
import com.demo.util.HibernateUtil;

public class TestOneToOneMapping {

	public static void main(String[] args) {
		// insertRecords();
		
		fetchFromTable();
		
		HibernateUtil.getSessionFactory().close();
		
	}

	private static void fetchFromTable() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Car car = session.get(Car.class, 1);
		System.out.println(car);
		Engine engine = car.getEngine();
		System.out.println(engine);
		System.out.println(engine.getCar());
		
		session.close();
	}

	private static void insertRecords() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Engine e1 = new Engine();
		e1.setPower(1.5);
		
		Car car1 = new Car();
		car1.setModel("Abc2014");
		car1.setEngine(e1);
		
		e1.setCar(car1);
		
		session.save(e1);
		session.save(car1);
		
		session.close();
	}
}
