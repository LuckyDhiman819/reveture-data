package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView view = new ModelAndView();
		view.setViewName("rev");
		return view;
	}
}