package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductApp {
	
	@RequestMapping("/product")
	public ModelAndView getView() {
		ModelAndView view = new ModelAndView();
		view.setViewName("product");
		return view;
		
	}

}
