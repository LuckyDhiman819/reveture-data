package com.revature.training.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.training.model.Employee;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/welcome")
	public String getMessage() {
		return "<h1>Hello and welcome to Spring Boot - By Tufail Ahmed<h1>";
	}
	@RequestMapping("/employee")
	public Employee getEmployee() {
		Employee employee = new Employee(900, "Lucky", 4546851);
		return employee;
	}
	@RequestMapping("/home")
	public String home() {
		return "<h1>Hello and welcome to Home Page<h1>";
	}
	@RequestMapping("/product")
	public String getProduct() {
		return "<h1>Hello and welcome to Product Page<h1>";
	}

}
