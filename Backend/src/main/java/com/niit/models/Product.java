package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String productname;
private String description;
private int quantity;
private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getDescription() {
	
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}