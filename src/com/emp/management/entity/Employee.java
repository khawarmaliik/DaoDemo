package com.emp.management.entity;

import com.google.gson.JsonObject;

public class Employee {
	int id;
	String name;
	int age;
	String city;
	String designation;
	String email;
	String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, String city, String designation, String email, String contact) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.designation = designation;
		this.email = email;
		this.contact = contact;
	}
}
