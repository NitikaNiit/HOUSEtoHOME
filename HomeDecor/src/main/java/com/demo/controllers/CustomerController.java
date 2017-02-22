package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.BillingAddress;
import com.demo.model.Customer;
import com.demo.model.ShippingAddress;
import com.demo.model.Users;
import com.demo.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	
	
	@RequestMapping("/signup")
	public String signUp(){
		return "Signupform";
		}
	
	@ModelAttribute("customer")
	public Customer createCustomer(){
		Customer customer = new Customer();
		BillingAddress billingAddress = new BillingAddress();
		ShippingAddress shippingAddress= new ShippingAddress();
		customer.setBillingAddress(billingAddress);
		customer.setShippingAddress(shippingAddress);
		return customer;
		
	}
	
	@RequestMapping("/registerCustomer")
	public String registerCustomer(Model model){
		Customer customer = new Customer();
		BillingAddress billingAddress = new BillingAddress();
		ShippingAddress shippingAddress= new ShippingAddress();
		customer.setBillingAddress(billingAddress);
		customer.setShippingAddress(shippingAddress);
		model.addAttribute("customer", customer);
		return "signUp";
	}
	
	@RequestMapping(value= "/registerCustomer", method=RequestMethod.POST)
	public String registerCustomerPost(@ModelAttribute("customer") Customer customer, BindingResult result, Model model){
	if(result.hasErrors()){
		return "Signupform";
			}
	customerService.saveCustomer(customer);
	/*customer.setEnabled(true);*/
	return "redirect:/registerConfirmed";
	
	}
	
}
	
	/*@RequestMapping("/signup")
	public String getRegistrationForm(Model model){
		model.addAttribute("customer",new Customer());
		model.addAttribute("customers", customerService.getCustomers());
		return "Signupform";

	}
	@ModelAttribute("customer")
	public Customer newCustomer() {
	
		return new Customer();

	}
	@RequestMapping("/registerCustomer")
	public String addCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		
		customerService.saveCustomer(customer);
		return "redirect:/getAllCustomers";
	}*/
	



