package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
public  PageController()
{
	System.out.println("Pagecontroller bean is created");
}


	@RequestMapping(value= {"/","/home"})
	public String home() {
	
		return "home";
	
	}

}
