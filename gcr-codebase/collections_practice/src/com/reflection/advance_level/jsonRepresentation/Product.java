package com.reflection.advance_level.jsonRepresentation;

//The class we want to convert to JSON
class Product {
	private int id;
	private String name;
	private double price;
	private boolean inStock;

	public Product(int id, String name, double price, boolean inStock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.inStock = inStock;
	}
}