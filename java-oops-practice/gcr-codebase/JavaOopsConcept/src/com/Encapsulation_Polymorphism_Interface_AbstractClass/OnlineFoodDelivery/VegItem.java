package com.Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDelivery;

class VegItem extends FoodItem implements Discountable {
	public VegItem(String name, double price, int qty) {
		super(name, price, qty);
	}

	@Override
	public double calculateTotalPrice() {
		return getPrice() * getQuantity(); // Standard calculation logic
	}

	@Override
	public double applyDiscount(double total) {
		return total * 0.90; // LOGIC: 10% discount for green items
	}

	@Override
	public String getDiscountDetails() {
		return "Green-Earth 10% Discount";
	}
}

