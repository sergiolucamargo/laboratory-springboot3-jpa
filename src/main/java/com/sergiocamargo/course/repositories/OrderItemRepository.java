package com.sergiocamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiocamargo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { }