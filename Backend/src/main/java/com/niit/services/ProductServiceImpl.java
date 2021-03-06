package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Dao.ProductDao;
import com.niit.models.Category;
import com.niit.models.Product;
@Repository
public  class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao productdao;
	public  ProductServiceImpl()
	{
		System.out.println("Product ServiceImpl bean is created");
	}

	@Override
	public void addProduct(Product product) {
		productdao.addProduct(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		productdao.updateProduct(product);
		
	}

	@Override
	public void deleteProduct(int id) {
		productdao.deleteProduct(id);
		
	}

	@Override
	public Product getProduct(int id) {
		return productdao.getProduct(id);
		 
	}

	@Override
	public List<Product> getAllProducts() {
		
		return  productdao.getAllProducts(); 
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
