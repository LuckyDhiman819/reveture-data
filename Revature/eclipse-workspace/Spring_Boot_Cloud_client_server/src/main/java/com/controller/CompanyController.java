package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Company;

@RestController
public class CompanyController {
	@Autowired
	Company company;
	
	@GetMapping("/printCompanyName")
	public Company getComapnyDetails() { 
		
		return company;
		
	}

}
