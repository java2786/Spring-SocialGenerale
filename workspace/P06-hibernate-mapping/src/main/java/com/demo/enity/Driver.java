package com.demo.enity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany//(fetch=FetchType.EAGER)
	private Collection<Car> cars = new ArrayList<Car>();

	public Driver() {
	}
	
	public Driver(String name) {
		super();
		this.name = name;
	}
	
	public Driver(String name, Collection<Car> cars) {
		this(name);
		this.cars = cars;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Car> getCars() {
		return cars;
	}

	public void setCars(Collection<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + "]";
	}
	
	

}
