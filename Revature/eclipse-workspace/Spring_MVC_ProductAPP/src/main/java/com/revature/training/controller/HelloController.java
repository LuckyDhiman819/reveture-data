package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping( value="/myapp" , method = RequestMethod.GET)
//	public ModelAndView getModelAndView()
	public String getModelAndView()
	{
		ModelAndView view = new ModelAndView();
//		view.setViewName("rev");
		 return "rev";
//		return view;
	}
}
