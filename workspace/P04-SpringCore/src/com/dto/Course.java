package com.dto;

import java.util.Map;

public class Course {
	int admissionYear;
	double fee;
	Map<Integer, String> subjects;

	public Course() { }
	
	public Course(int admissionYear, double fee) {
		super();
		this.admissionYear = admissionYear;
		this.fee = fee;
	}
	
	public int getAdmissionYear() {
		return admissionYear;
	}
	public void setAdmissionYear(int admissionYear) {
		this.admissionYear = admissionYear;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Map<Integer, String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<Integer, String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Course [admissionYear=" + admissionYear + ", fee=" + fee
				+ ", subjects=" + subjects + "]";
	}
	
}
