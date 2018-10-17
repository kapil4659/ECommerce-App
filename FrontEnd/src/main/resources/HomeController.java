package com.niit.controllers
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HomeController {
public HomeController() {
	System.out.println("homecontroller is created");
}
@RequestMapping(value="/home")
public String getHomePage() {
	return "home";
}
}
