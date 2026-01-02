package com.Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDelivery;

//ABSTRACT CLASS: Cannot be instantiated; provides a template for all food items
abstract class FoodItem {
	// ENCAPSULATION: Private fields accessible only via methods
	private String itemName;
	private double price;
	private int quantity;

	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters for Encapsulated data
	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	// ABSTRACT METHOD: Forces subclasses to define their own pricing logic
	public abstract double calculateTotalPrice();

	public void getItemDetails() {
		System.out.println("Item: " + itemName + " | Rate: " + price + " | Qty: " + quantity);
	}
}