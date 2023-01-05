package com.multithreding.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("task8")

public class User {
	
	
	private String name;
	private String email;
	private String gender;

	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public User( String name, String email, String gender) {
		super();
		
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [ name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
	
	
	

}
