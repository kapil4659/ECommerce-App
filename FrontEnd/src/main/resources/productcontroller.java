package com.niit.Controller;

import org.springframework.ui.Model;

@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;
	public ProductController()
	{
		System.out.println("Product Controller bean is created");
	}
	@RequestMapping(value="/all/getallproducts")
	public String getAllProducts(Model model)
	{
		List<Product> products= productService.getAllProducts();
		model.addAttribute("products",products);
		return "listofProducts";
	}

}
