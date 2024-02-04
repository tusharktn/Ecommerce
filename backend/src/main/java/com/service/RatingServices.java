package com.service;

import java.util.List;

import com.exception.ProductException;
import com.modal.Rating;
import com.modal.User;
import com.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
