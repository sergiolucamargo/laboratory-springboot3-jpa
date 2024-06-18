package com.sergiocamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiocamargo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { }

