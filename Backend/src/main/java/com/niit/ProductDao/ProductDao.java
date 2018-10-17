package com.niit.ProductDao;

import java.util.List;

import com.niit.models.Product;

public interface ProductDao {
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int id);
	Product getProduct(int id);
	List<Product> getAllProducts();
}
