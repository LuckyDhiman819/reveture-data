package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/getName")
	public String getName(){
		System.out.println("Inside Client project");
		return "This is my first eureka client app";
	}
}
//localhost:8083/getName