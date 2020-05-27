package com.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Employee;

@Repository
public class EmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void add(Employee emp) {
		em.persist(emp);
	}
}
