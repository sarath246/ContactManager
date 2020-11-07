package com.codejava.contact.controller;

import javax.validation.Valid;
import javax.xml.bind.Binder;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codejava.contact.model.UploadProduct;


@Controller
@RequestMapping(value = "/upload-product")
public class UploadProductController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping(value = "/showForm")
	public String processForm(Model model) {
		
		model.addAttribute("uploadProduct", new UploadProduct());
		
			return "User/add-products";
		
	}
	@RequestMapping(value = "/procesForm")
	public String procesForm(@Valid @ModelAttribute("uploadProduct") UploadProduct uploadProduct, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			
			return "User/add-products";
		}else {
		
			return "User/add-products-success";
		}
	}
}
