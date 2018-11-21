//package com.niit.Dao;
//
//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.niit.Dao.ProductDao;
//import com.niit.models.Product;
//@Repository
//@Transactional
//public class ProductDaoImpl implements ProductDao
//{
//@Autowired
//	private SessionFactory sessionFactory;
//	public ProductDaoImpl()
//	{
//		System.out.println("productDaoImpl bean is created");
//	}
//	public void addProduct(Product product)
//	{
//		Session session=sessionFactory.openSession();
//		session.save(product);//permanently store the product
//		session.flush();
//	}
//	@Override
//	public void updateProduct(Product product) {
//		Session session=sessionFactory.openSession();
//		session.update(product);//permanently store the product
//		session.flush();
//		
//	}
//	@Override
//	public void deleteProduct(int id) {
//		Session session=sessionFactory.openSession();
//		Product product=(Product)session.get(Product.class,id);//permanently store the product
//		session.delete(product);
//		session.flush();
//		
//	}
//	@Override
//	public Product getProduct(int id) {
//		Session session=sessionFactory.openSession();
//		Product product=(Product)session.get(Product.class,id);//permanently store the product
//		session.flush();
//		return product;
//	}
//	@Override
//	public List<Product> getAllProducts() {
//		Session session = sessionFactory.openSession();
//		Query query =session.createQuery("from Product");
//		List<Product>products=query.list();
//		return products;
//	}
//	
//		
//	}




package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired//Spring container auto wire bean of type SessionFactory
private SessionFactory sessionFactory;
	
	
	public ProductDaoImpl(){
		System.out.println("ProductDaoImpl bean is created");
	}
	
	public void addProduct(Product product) {//product is input
		//database operation -insert product details in product table
		System.out.println("Before inserting product " + product.getId());
		Session session=sessionFactory.getCurrentSession();
		session.save(product);//permanently store the product object in database, session.sav
		System.out.println("After inserting product " + product.getId());
		
	}

	public void updateProduct(Product product) {//product.id=5
		Session session=sessionFactory.getCurrentSession();
		session.update(product);//-> details will get updated in the table
	}

	public Product getProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		return product;
	}

	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		if(product!=null)
		session.delete(product);//delete from product where id=1
	}

	public List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Product");//HQL ,Product is java class name/entity name
		 List<Product> products= query.list();
		 return products;
		//hibernate will get converted into SQL query 
		//and fetch all the records 
		//and convert it into list of products
	}

}




