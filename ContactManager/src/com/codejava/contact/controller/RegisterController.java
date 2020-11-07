package com.codejava.contact.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codejava.contact.dao.RegisterDao;
import com.codejava.contact.model.Register;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterDao registerDao;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerForm(ModelAndView model) {

		Register newRegister = new Register();			// create a register object
		model.addObject("registration",newRegister);
		model.setViewName("Register");
	
		return model;
	}  
	
	@RequestMapping(value = "/saved", method = RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("registration") Register registeruser) {
	
		
			registerDao.saved(registeruser);
		
			return new ModelAndView("redirect:/reg");
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView successForm(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView("reg");
		
		model.setViewName("register-succes");
	
		return model;
	}
	
}
