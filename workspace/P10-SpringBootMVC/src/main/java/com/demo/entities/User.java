package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id;
	private String email;
//	private String first_name;
//	private String last_name;
	private String password;
	private Integer age;
	private String address;
	private String city;
	private String zip;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Integer getId() {
//		return id;
//	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", age=" + age + ", address="
				+ address + ", city=" + city + ", zip=" + zip + "]";
	}

}
