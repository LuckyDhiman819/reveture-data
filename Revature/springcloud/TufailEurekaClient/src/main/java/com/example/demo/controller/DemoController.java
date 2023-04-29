package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/getDataFromCloud")
	public String getDataFromCloud() {
		System.out.println("Inside Client project");
		return "Hello Tufail! How are you today !!";
	}
}
