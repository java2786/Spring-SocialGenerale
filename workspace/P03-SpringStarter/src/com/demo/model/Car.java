package com.demo.model;

public class Car {

	public Car() {
		System.out.println("Car initilized");
	}
	private String brand;
	private Engine engine;
	private String year;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("in car's setBrand");
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + ", year=" + year + "]";
	}
	
}
