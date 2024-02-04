package com.service;

import com.exception.ProductException;
import com.modal.Cart;
import com.modal.CartItem;
import com.modal.User;
import com.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
