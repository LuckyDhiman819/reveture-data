package com.reature.ems.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component("emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private String empName;
	private int empId;
	private String empAddress;
	private int salary;
	private int bonus;
	
//	object Email
	
	@Autowired
	@Qualifier("email2")
	private Email email;
	
	@Autowired
	private ContactDetails contact;
	
	
	
	
	@PostConstruct
	public void rev1() {
		empName = "Ram Pal";
		System.out.println("rev1 called");
	}
	
	@PreDestroy
	public void doneWithEmployee() {
		System.out.println("End method called");
		empName = null;
	}

	
	

	
}
