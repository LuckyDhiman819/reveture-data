package com.ahmed.training.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Employee {

	@Email
	private String email;
	
	@Size(min = 5, max = 20, message = "Please enter between {min} and {max} characters.")
	private String text;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Employee [email=" + email + ", text=" + text + "]";
	}

}
