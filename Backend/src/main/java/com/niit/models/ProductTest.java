//package com.niit.models;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//import junit.framework.TestCase;
//
//public class ProductTest extends TestCase {
//	@Entity
//	public class Product {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String productname;
//	private String productdesc;
//	private int quantity;
//	private double price;
//	@ManyToOne
//	private Category category;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getProductname() {
//		return productname;
//	}
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}
//	public String getProductdesc() {
//		return productdesc;
//	}
//	public void setProductdesc(String productdesc) {
//		this.productdesc = productdesc;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public Category getCategory() {
//		return category;
//	}
//	public void setCategory(Category category) {
//		System.out.println("Setter method for category property in Product");
//		this.category = category;
//	}
//
//	}
//
//
//
//}
