package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
