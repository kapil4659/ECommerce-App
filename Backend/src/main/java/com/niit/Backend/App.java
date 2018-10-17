package com.niit.Backend;

import com.niit.configuration.DBConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class);
//       ProductDao productDao=(ProductDao)context.getBean("ProductDaoImpl");
//       //Product Details
//       Product product=new Product();
//       product.setProductname("Pen");
//       product.setDescription("parker pen");
//       product.setPrice(1000);
//       product.setQuantity(5);
    }
}
