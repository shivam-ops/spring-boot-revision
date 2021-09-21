package com.example.youtube.myapp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.youtube.myapp.entities.Product;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {
	
}
