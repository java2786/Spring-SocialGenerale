package com.dto;

public class Invoice {
	boolean purchased;

	public boolean isPurchased() {
		return purchased;
	}

	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}

	@Override
	public String toString() {
		return "Invoice [purchased=" + purchased + "]";
	}

	
}
