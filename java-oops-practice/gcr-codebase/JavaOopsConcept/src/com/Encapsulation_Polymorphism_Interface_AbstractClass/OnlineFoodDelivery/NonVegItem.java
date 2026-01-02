package com.Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDelivery;

class NonVegItem extends FoodItem {
	public NonVegItem(String name, double price, int qty) {
		super(name, price, qty);
	}

	@Override
	public double calculateTotalPrice() {
		// LOGIC: Includes an additional packaging/handling charge of 40
		return (getPrice() * getQuantity()) + 40.0;
	}
}
