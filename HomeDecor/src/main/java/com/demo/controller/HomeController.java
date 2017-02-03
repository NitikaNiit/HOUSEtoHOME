package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homepage()
	{
		return "home";
	}
	@RequestMapping("/HOME")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/CONTACT")
	public String Contactus()
	{
		return "contact";
	}
	@RequestMapping("/PRODUCTS")
	public String database()
	{
	return "Product";
	}
	@RequestMapping("/View")
	public String vmore()
	{
	return "Viewmore";
	}
	/*@RequestMapping("/SIGNUP")
	public String sign()
	{
	return "signup";
	}
	@RequestMapping("/LOGIN")
	public String Login()
	{
	return "login";
	}*/
}
