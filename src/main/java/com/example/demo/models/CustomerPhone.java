package com.example.demo.models;

public class CustomerPhone {
	
	private int customerId;
	
	private String phoneNumber;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CustomerPhone [customerId=" + customerId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
