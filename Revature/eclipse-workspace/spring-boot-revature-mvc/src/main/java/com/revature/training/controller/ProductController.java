package com.revature.training.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.training.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping("product")
	public ModelAndView getProductApp() {
		ModelAndView view = new ModelAndView();
		view.setViewName("productapp");
		return view;
		
	}
	
	@RequestMapping("addProductForm")
	public ModelAndView getProductForm() {
		ModelAndView view = new ModelAndView("addProductForm");
		Product product = new Product(100, "kit kat", 500, 400);
		view.addObject("product", product);
		view.setViewName("productForm");
		return view;
	}
	
	@RequestMapping("saveProduct")
	public ModelAndView saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		
		ModelAndView view = new ModelAndView();
		if (result.hasErrors()) {
			System.out.println("Has error");
			view.setViewName("productForm");
		} else {
			System.out.println("No Error");
			view.setViewName("success");
		}
		System.out.println(product);
		return view;

	}
	
}
