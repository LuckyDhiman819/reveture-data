package com.reature.ems.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("contact")
public class ContactDetails {
	
	private String phoneNumber;
	private String homeNumber;
	private String parentsNumber;
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactDetails(String phoneNumber, String homeNumber, String parentsNumber) {
		super();
		this.phoneNumber = phoneNumber;
		this.homeNumber = homeNumber;
		this.parentsNumber = parentsNumber;
	}
	
	@PostConstruct
	public void detais() {
		System.out.println("Contact Called");
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getParentsNumber() {
		return parentsNumber;
	}
	public void setParentsNumber(String parentsNumber) {
		this.parentsNumber = parentsNumber;
	}
	@Override
	public String toString() {
		return "ContactDetails [phoneNumber=" + phoneNumber + ", homeNumber=" + homeNumber + ", parentsNumber="
				+ parentsNumber + "]";
	}
	
	

}
