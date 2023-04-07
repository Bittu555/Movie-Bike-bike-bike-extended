package com.global.Bike;

public class Bike1 {
	
	private int bike_id;
	private String name;
	private String email;
	private String address;
	private String mobile_num;
	private String date_service;
	private int emp_id;
	
	
	public Bike1() {
		
	}


	public Bike1(int bike_id, String name, String email, String address, String mobile_num, String date_service,
			int emp_id) {
		super();
		this.bike_id = bike_id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile_num = mobile_num;
		this.date_service = date_service;
		this.emp_id = emp_id;
	}


	public int getBike_id() {
		return bike_id;
	}


	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobile_num() {
		return mobile_num;
	}


	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}


	public String getDate_service() {
		return date_service;
	}


	public void setDate_service(String date_service) {
		this.date_service = date_service;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	
	
	}
	


