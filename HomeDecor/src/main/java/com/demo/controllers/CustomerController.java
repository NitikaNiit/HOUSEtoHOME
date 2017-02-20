package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/signup")
	public String getRegistrationForm(Model model){
		model.addAttribute("customer",new Customer());
		return "Signupform";

	}

	@ModelAttribute("/customerr")
	public Customer newCustomer() {
	
		return new Customer();

	}

	@RequestMapping("/addNewCustomer")
	public String addSupplier(@Valid @ModelAttribute(value = "customer") Customer c, BindingResult result) {
		if (result.hasErrors())
			return "customerform";
		customerService.saveCustomer(c);
		return null;
	}
}
