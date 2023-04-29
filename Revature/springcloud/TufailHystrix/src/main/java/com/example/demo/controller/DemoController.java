package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private TufailImpl tufailImpl;

	ResponseEntity<String> exchange = null;

	@RequestMapping("/getAccounts")
	public String getAccounts() {
		try {
			exchange = tufailImpl.getName();
			return exchange.getBody() + "::status code :" + exchange.getStatusCodeValue();
		} catch (Exception e) {

		}
		return null;

	}

	@RequestMapping("/getData")
	public String getData() {
		try {
			String data = tufailImpl.getData();
			return data;
		} catch (Exception e) {

		}
		return null;

	}

}
