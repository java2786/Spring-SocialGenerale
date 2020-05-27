package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.demo.enity.Car;
import com.demo.enity.Driver;
import com.demo.enity.Tyre;
import com.demo.util.HibernateUtil;

public class TestManyToManyMapping {

	public static void main(String[] args) {
		saveData();
		
		readCarData();
//		readDriverData();
		HibernateUtil.getSessionFactory().close();
	}
	
	private static void readDriverData() {
		Driver driver = null;
		Session session = HibernateUtil.getSessionFactory().openSession();

		driver = session.get(Driver.class, 2);
		System.out.println(driver);
		
		session.close();
		System.out.println(driver.getCars());
	}

	private static void readCarData() {
		Car car = null;
		Session session = HibernateUtil.getSessionFactory().openSession();

		car = session.get(Car.class, 2);
		System.out.println(car);
		
		session.close();
		System.out.println(car.getDrivers());
	}

	private static void saveData() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Car car1 = new Car();
		car1.setModel("Maruti");

		Car car2 = new Car();
		car2.setModel("BMW");

		
		Driver driver1 = new Driver();
		driver1.setName("Tom");
		
		driver1.getCars().add(car1);

		
		Driver driver2 = new Driver();
		driver2.setName("Carl");
		
		driver2.getCars().add(car1);
		driver2.getCars().add(car2);
		
		car1.getDrivers().add(driver1);

		car1.getDrivers().add(driver2);
		car2.getDrivers().add(driver2);
		
//		session.save(driver1);
//		session.save(driver2);
		
		session.save(car1);
		session.save(car2);
		
		
		session.getTransaction().commit();
		session.close();
	}
}
