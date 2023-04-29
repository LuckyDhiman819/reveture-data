package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView getHome() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		return view;	
	}
	
	@RequestMapping("/home/another")
	public String getagainHome() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		return "home";	
	}
	
}
