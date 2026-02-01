package com.lambda_expressions.customSortingEcommerce;

public class Product {
	String name;
	double price;
	double rating;
	
	public Product(String name, double price, double rating) {
		this.name=name;
		this.price=price;
		this.rating=rating;
		
	}
	
	@Override
	public String toString() {
		return String.format(" %-10s | Price %.2f | Rating: %.2f",name,price,rating);
	}
	
}
