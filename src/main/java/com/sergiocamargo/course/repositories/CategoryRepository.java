package com.sergiocamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiocamargo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { }

