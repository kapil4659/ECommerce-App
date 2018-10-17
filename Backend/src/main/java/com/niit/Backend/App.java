package com.niit.Backend;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.ProductDao.ProductDao;
import com.niit.ProductDao.ProductDaoImpl;
import com.niit.models.Product;
import com.niit.services.ProductService;
import com.niit.services.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class,ProductServiceImpl.class);
       ProductService productService = (ProductService) context.getBean("productServiceImpl");
       Product product = new Product();
       List<Product> products= productService.getAllProducts();
       product.setId(4);
       product.setProductname("HeadPhone");
       product.setDescription("Senheiser");
       product.setPrice(6000);
       product.setQuantity(8);
    //   productService.addProduct(product);
	   productService.deleteProduct(4);
    //  productService.updateProduct(product);
     // Product p= productService.getProduct(1);
       for(Product p:products) {
     System.out.println(p.getId()+" "+p.getProductname()+" "+p.getDescription()+" "+p.getQuantity()+" "+p.getPrice());
    }
    }
}
