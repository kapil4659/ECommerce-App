package com.niit.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductController {
@Autowired
private ProductService productService;
public ProductController() {
	System.out.println("ProductController bean is being is created")
}
@RequestMapping(value="/all/getallproducts")
public String getAllProducts(Model model) {
	List<Product> products=producyService.getAllProducts();
	model.addAttribute("products",products);
	return "listofproducts";
}
}
