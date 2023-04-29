package com.revature.training.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication 
@RestController
public class AnotherController {
	
	@RequestMapping("/another")
	public String getMessage() {
		return "<h1>Hello and welcome to another controller app<h1>";
	}

	
	
}
