package com.demo.enity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String model;
	
	@OneToOne
	@JoinColumn(name="e_id")
	private Engine engine;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="car")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<Tyre> tyres;
	
	@ManyToMany(mappedBy="cars", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Collection<Driver> drivers = new ArrayList<Driver>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Collection<Tyre> getTyres() {
		return tyres;
	}
	public void setTyres(Collection<Tyre> tyres) {
		this.tyres = tyres;
	}
	public Collection<Driver> getDrivers() {
		return drivers;
	}
	public void setDrivers(Collection<Driver> drivers) {
		this.drivers = drivers;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", engine=" + engine + ", tyres=" + tyres + ", drivers=" + drivers
				+ "]";
	}
	
	

}
