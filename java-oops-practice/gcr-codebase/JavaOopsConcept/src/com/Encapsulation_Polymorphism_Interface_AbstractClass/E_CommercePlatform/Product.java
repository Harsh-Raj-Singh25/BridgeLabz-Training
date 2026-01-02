package com.Encapsulation_Polymorphism_Interface_AbstractClass.E_CommercePlatform;

abstract class Product {
	private int productId;
	private String name;
	private double price;

	public Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Encapsulation: Accessors and Mutators
	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Abstract method: Each category has different discount rules
	public abstract double calculateDiscount();

	// Concrete method for common display
	public void showBaseDetails() {
		System.out.print("ID: " + productId + " | Name: " + name + " | Base: Rs. " + price);
	}
}