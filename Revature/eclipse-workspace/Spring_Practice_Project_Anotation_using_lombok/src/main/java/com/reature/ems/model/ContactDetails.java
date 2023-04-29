package com.reature.ems.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("contact")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDetails {
	
	private String phoneNumber;
	private String homeNumber;
	private String parentsNumber;
	
	
	@PostConstruct
	public void detalis() {
		System.out.println("Contact Called");
	}
	
	
	
	

}
