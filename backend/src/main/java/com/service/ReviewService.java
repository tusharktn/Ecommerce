package com.service;

import java.util.List;

import com.exception.ProductException;
import com.modal.Review;
import com.modal.User;
import com.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
