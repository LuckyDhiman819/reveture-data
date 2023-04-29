package com.reature.ems.model;

import org.springframework.stereotype.Component;

@Component("from")
public class From {
	
	private String toName;
	private String toEmail;
	public From() {
		super();
		// TODO Auto-generated constructor stub
	}
	public From(String toName, String toEmail) {
		super();
		this.toName = toName;
		this.toEmail = toEmail;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	@Override
	public String toString() {
		return "From [toName=" + toName + ", toEmail=" + toEmail + "]";
	}
	

}
