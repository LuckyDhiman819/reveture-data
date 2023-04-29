package com.example.demo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class TufailImpl {

	@Autowired
	private BackEndService backEndService;

	@Autowired
	private RestTemplate restTemplate;

	private ResponseEntity<String> exchange = null;

	@HystrixCommand(fallbackMethod = "customFallback")
	public ResponseEntity<String> getName() {
		try {
			System.out.println("*********************Inside URI ...*******************");
			URI endPoint = URI.create("http://localhost:8083/getDataFromCloud");
			return restTemplate.getForEntity(endPoint, String.class);
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	public ResponseEntity<String> apple() {
		System.out.println("*********************Micoservice is not available*******************");
		return exchange;

	}

	@HystrixCommand(fallbackMethod = "helloError")
	public String getData() {
		try {
			System.out.println("*********************Inside 1st Main*******************");
			return backEndService.getData();
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	public String helloError() {
		System.out.println("*********************Inside getData fallback*******************");
		return "fallback";

	}

}















