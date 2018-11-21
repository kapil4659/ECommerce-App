package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CartItemDao;
import com.niit.models.CartItem;
import com.niit.models.CustomerOrder;

@Service
public class CartItemServiceImpl implements CartItemService {
	@Autowired
	private CartItemDao cartItemDao;




	@Override
	public List<CartItem> getCart(String email) {

		return cartItemDao.getCart(email);
	}

	@Override
	public void removeCartItem(int cartItemId) {
		cartItemDao.removeCartItem(cartItemId);

	}

	@Override
	public void createCustomerOrder(CustomerOrder customerOrder) {
		cartItemDao.createCustomerOrder(customerOrder);

	}


	@Override
	public void addToCart(CartItem cartItem) {
		cartItemDao.addToCart(cartItem);
		// TODO Auto-generated method stub
		
	}


			
	}
