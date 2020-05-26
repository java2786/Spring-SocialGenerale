package com.dto;

import java.util.Date;

public class Book {
	float price;
	Date issueDate;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", issueDate=" + issueDate + "]";
	}
	
	
	
}
