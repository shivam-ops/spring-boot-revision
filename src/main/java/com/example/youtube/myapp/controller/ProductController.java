package com.example.youtube.myapp.controller;

import java.util.ArrayList;
import java.util.List;

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
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		
		List<Product> myProducts = new ArrayList<>(); 
		
		Product p1 = new Product(1, "A", 10);
		Product p2 = new Product(1, "B", 20);
		Product p3 = new Product(1, "C", 30);
		
		myProducts.add(p1);
		myProducts.add(p2);
		myProducts.add(p3);
		
		return myProducts;
	}
}
