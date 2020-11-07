package com.codejava.contact.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView("login");
		
		model.setViewName("Login");
		return model;
	}
	@RequestMapping(value = "/log")
	public ModelAndView loginProcess(ModelAndView model) {
		
		model.setViewName("view");
			
		return model;
	}
	
}
