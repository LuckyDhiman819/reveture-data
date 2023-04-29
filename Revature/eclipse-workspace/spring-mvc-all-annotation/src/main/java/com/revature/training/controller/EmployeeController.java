package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.training.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/emp")
	public ModelAndView getEmp() {
		ModelAndView view = new ModelAndView();
		view.setViewName("employee");
		return view;
	}
	@RequestMapping("/empForm")
	public ModelAndView getEmpForm() {
		ModelAndView view = new ModelAndView();
		view.setViewName("EmployeeForm");
		return view;
	}
	@RequestMapping("/saveEmployee")
	public ModelAndView getSaveEmpForm(Employee employee) {
		ModelAndView view = new ModelAndView("viewPage");
		view.setViewName("saveEmployee");
		view.addObject("message", "Data is saves");
		view.addObject("emp", employee);
		System.out.println(employee);
		return view;
	}
}
