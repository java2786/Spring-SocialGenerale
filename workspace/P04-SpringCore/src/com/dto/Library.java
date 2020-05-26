package com.dto;

public class Library {
	String address;
	Book book;
	Person librarian;
	
	public Library(){}
	public Library(Person librarian){
		System.out.println("in library constructor");
		this.librarian = librarian;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Person getLibrarian() {
		return librarian;
	}
	public void setLibrarian(Person librarian) {
		this.librarian = librarian;
	}
	@Override
	public String toString() {
		return "Library [address=" + address + ", book=" + book
				+ ", librarian=" + librarian + "]";
	}
	
}
