package com.Generics.DynamicOnlineMarketplace;
/*
 * 2. Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product
 types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.

 */
class Product <T extends Category> {
	private String name;
	private double price;
	private T category;
	
	public Product(String name, double price, T category) {
		this.category=category;
		this.name=name;
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Product:"+name+" | Category : "+category.getCategoryName()+" | Price : Rs."+price);
	}
	
	
}
