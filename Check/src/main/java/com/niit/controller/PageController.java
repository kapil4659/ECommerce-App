package com.niit.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.models.CartItem;
import com.niit.services.CartItemService;

@Controller
public class PageController {
	@Autowired
private CartItemService cartItemService;
public PageController(){
	System.out.println("homeController bean is created");
}
@RequestMapping(value= {"/","/home"})
public String getHomePage(@AuthenticationPrincipal Principal principal,HttpSession session){
	if(principal!=null){
		//GET THE SIZE OF THE CART
		String email=principal.getName();
		List<CartItem> cartItems=cartItemService.getCart(email);
		session.setAttribute("cartSize", cartItems.size());
	}
	return "home";
}
@RequestMapping("/login")
public String login(){
	return "login";
}
@RequestMapping("/loginerror")
public String loginError(Model model){
	model.addAttribute("loginError","Invalid email/password");
	return "login";
}
@RequestMapping(value="/logout")
public String logout(Model model){
	model.addAttribute("message","Loggedout successfully..");
	return "login";
}



}

