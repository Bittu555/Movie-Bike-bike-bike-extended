package com.global.customer;

public class Customer {
	
	public int customerId;
	public String customerName;
	private int age;
	private String address;
	
	public Customer(){
		
	}

	public Customer(int customerId, String customerName, int age, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
