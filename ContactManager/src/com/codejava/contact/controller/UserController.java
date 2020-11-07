package com.codejava.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "/userhome")
	public String userHomepage() {
		
		return "User/homepage";
	}
	@RequestMapping(value ="/purchase-product")
	public String purchaseProduct(ModelAndView model) {
		
		return "User/purchase-products";
	}
	
}
