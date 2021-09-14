package com.example.youtube.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.myapp.entities.Product;

@RestController
public class ProductController {
	
	@GetMapping("/welcome")
	public String say () {
		return "Welcome to prduct page";
	}
	
	// Jackson converts POJO's to JSON
	@GetMapping("/product")
	public Product getProduct() {
		Product myProduct = new Product(1, "A", 10);
		return myProduct;
	}
}
