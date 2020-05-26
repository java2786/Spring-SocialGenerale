package com.dto;

public class Manager extends Employee{
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", salary="
				+ getSalary() + ", workExperience=" + getWorkExperience()
				+ ", dept=" + getDept() + ", name=" + getName() + ", age="
				+ getAge() + "]";
	}
	
}
