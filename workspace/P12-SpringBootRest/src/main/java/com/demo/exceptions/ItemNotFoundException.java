package com.demo.exceptions;

public class ItemNotFoundException extends Exception{

	public ItemNotFoundException() {
		super();
	}
	public ItemNotFoundException(String msg) {
		super(msg);
	}
	public ItemNotFoundException(Exception ex) {
		super(ex);
	}
	public ItemNotFoundException(String msg, Exception ex) {
		super(msg, ex);
	}
}
