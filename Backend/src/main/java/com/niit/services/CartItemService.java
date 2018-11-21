package com.niit.services;

import java.util.List;

import com.niit.models.CartItem;
import com.niit.models.CustomerOrder;

public interface CartItemService {

	List<CartItem> getCart(String email);

	void removeCartItem(int cartItemId);



	void addToCart(CartItem cartItem);


//	void addToCart(CartItem cartItem);
//
//	List<CartItem> getCart(String email);
//
//	void removeCartItem(int cartItemId);
//
	void createCustomerOrder(CustomerOrder customerOrder);

}

