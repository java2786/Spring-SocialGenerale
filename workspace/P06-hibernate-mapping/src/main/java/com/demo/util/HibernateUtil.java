package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	static {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.configure("hibernate.cfg.xml")
				.configure()
				.build();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.getMetadataBuilder()
				.build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}