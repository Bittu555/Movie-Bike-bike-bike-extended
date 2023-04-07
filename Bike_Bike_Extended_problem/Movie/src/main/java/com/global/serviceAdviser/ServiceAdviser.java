package com.global.serviceAdviser;

import java.util.List;
import java.util.Set;



public class ServiceAdviser {
	
private int emp_id;
private String emp_name;
private String address;
private String phone;
private String email_id;

public ServiceAdviser() {
	
}

public ServiceAdviser(int emp_id, String emp_name, String address, String phone, String email_id) {

	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.address = address;
	this.phone = phone;
	this.email_id = email_id;
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail_id() {
	return email_id;
}

public void setEmail_id(String email_id) {
	this.email_id = email_id;
}


}
