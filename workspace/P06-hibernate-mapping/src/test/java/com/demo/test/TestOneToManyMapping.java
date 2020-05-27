package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.demo.enity.Car;
import com.demo.enity.Tyre;
import com.demo.util.HibernateUtil;

public class TestOneToManyMapping {

	public static void main(String[] args) {
		saveData();
		
		readData();
		HibernateUtil.getSessionFactory().close();
	}

	private static void readData() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Tyre tyre = session.get(Tyre.class, 2);
		System.out.println(tyre.getCar());
		
		session.close();
	}

	private static void saveData() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Car car = new Car();
		
		List<Tyre> tyres = new ArrayList<Tyre>();
		tyres.add(new Tyre("A", car));
		tyres.add(new Tyre("F125", car));
		tyres.add(new Tyre("QQ45", car));
		
		car.setTyres(tyres);
		
		session.save(car);
		
		session.getTransaction().commit();
		session.close();
	}
}
