package com.example.youtube.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.youtube.myapp.entities.Product;
import com.example.youtube.myapp.services.ProductJPARepository;


@RestController
public class ProductController {
	
	@Autowired
	private ProductJPARepository productService;
	
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
		return productService.findAll();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.findById(id).get();
	}
}
