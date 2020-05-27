package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	public void create(Employee emp) {
		// business logic
		empDao.add(emp);
	}
	
	public List<Employee> readAll() {
		return empDao.readAll();
	}
	public Employee readOne(int id) {
		return empDao.readOne(id);
	}
	public Employee update(int id, String name) {
		return empDao.update(id, name);
	}
	public void delete(int id) {
		//... 
		empDao.delete(id);
	}

	
}
