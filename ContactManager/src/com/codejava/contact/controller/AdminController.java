package com.codejava.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codejava.contact.dao.RegisterDao;
import com.codejava.contact.model.Register;

@Controller
public class AdminController {
	
	@Autowired
	private RegisterDao registerDao;

	@RequestMapping(value = "/home")
	public String adminDashboard() {
		
		return "Admin/Dashboard";
	}
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView listRegister(ModelAndView model) {
		
		List<Register> listRegisters=registerDao.list();
		model.addObject("listRegisters", listRegisters);
		model.setViewName("Admin/view-users");
		return model;
	}
	
}
