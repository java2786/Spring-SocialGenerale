package com.demo.model;

public class Engine {
	public Engine() {
		System.out.println("Engine initilized");
	}
	

	public Engine(String manufacturer, double power, String type) {
		System.out.println("initializing engine using constructor");
		this.manufacturer = manufacturer;
		this.power = power;
		this.type = type;
	}



	private String manufacturer;
	private double power;
	private String type;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [manufacturer=" + manufacturer + ", power=" + power + ", type=" + type + "]";
	}
	
}
