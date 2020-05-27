package com.demo.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tyre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String manufaturedBy;
	
	@ManyToOne
	private Car car;
	
	public Tyre() {}
	public Tyre(String manufaturedBy) {
		this.manufaturedBy=manufaturedBy;
	}
	public Tyre(String manufaturedBy, Car car) {
		this(manufaturedBy);
		this.car = car;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufaturedBy() {
		return manufaturedBy;
	}
	public void setManufaturedBy(String manufaturedBy) {
		this.manufaturedBy = manufaturedBy;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Tyre [id=" + id + ", manufaturedBy=" + manufaturedBy + "]";
	}
	
	
}
