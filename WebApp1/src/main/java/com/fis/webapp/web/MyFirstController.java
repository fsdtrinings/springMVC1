package com.fis.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {

	public MyFirstController() {
		super();
		System.out.println("Inside Web Controller - default constructor called");
	}
	
	@RequestMapping("/")
	public String showHomePage()
	{
		return "homepage";
	}
	
	

}
