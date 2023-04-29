package com.reature.ems.model;

import org.springframework.stereotype.Component;

@Component("body")
public class Body {

	private String message;

	public Body() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Body(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Body [message=" + message + "]";
	}
	
	
	
}
