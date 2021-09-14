package com.example.youtube.myapp.entities;

public class Product {
	private Integer id;
	private String name;
	private int price;
	
//	public Product() {
//		
//	}
	
	public Product(Integer id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
