package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Employee;

@Repository
@Transactional
public class EmployeeDao {

	@PersistenceContext
	private EntityManager em;
	
	public void add(Employee emp) {
		em.persist(emp);
		
//		emp.setLastName("mnop");
	}
	
	public List<Employee> readAll() {
		CriteriaQuery<Employee> cq = em.getCriteriaBuilder().createQuery(Employee.class);
		
		Root<Employee> root = cq.from(Employee.class);
		
		List<Employee> resultList = em.createQuery(cq).getResultList();
		return resultList;
	}

	public Employee readOne(int id) {
		return em.find(Employee.class, id);
	}

	public Employee update(int id, String name) {
		// empId --> find in database
		Employee employee = readOne(id);
		if(employee==null) {
			return null;			
		} else {
			employee.setFirstName(name);
			return employee;
		}
	}

	public void delete(int id) {
		Employee emp = readOne(id);
		if(emp!=null) {
			em.remove(emp);
		}
	}
	
}
