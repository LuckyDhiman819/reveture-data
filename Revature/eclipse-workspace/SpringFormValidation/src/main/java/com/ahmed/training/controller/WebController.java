package com.ahmed.training.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ahmed.training.model.Employee;

@Controller
public class WebController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String requestInfo(Employee requestInfo) {
		return "request";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	String requestInfo(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "request";
		}

		System.out.println(employee);

		return "successful";
	}
}
