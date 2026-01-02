package com.Encapsulation_Polymorphism_Interface_AbstractClass.OnlineFoodDelivery;

public class Main {
	public static void main(String[] args) {
		// POLYMORPHISM: Storing different subclasses in a single list of type FoodItem
		java.util.List<FoodItem> cart = new java.util.ArrayList<>();
		cart.add(new VegItem("Paneer Tikka", 250, 2));
		cart.add(new NonVegItem("Butter Chicken", 400, 1));

		double grandTotal = 0;
		System.out.println("----Order Summary----");
		for (FoodItem item : cart) {
			double total = item.calculateTotalPrice(); // Polymorphic call
			
			// Checking for INTERFACE 
			if (item instanceof Discountable) {
				System.out.println("Applied: " + ((Discountable) item).getDiscountDetails());
				total = ((Discountable) item).applyDiscount(total);
			}

			item.getItemDetails();
			System.out.println("Subtotal: Rs. " + total);
			grandTotal += total;
		}
		System.out.println("---------------------------");
		System.out.println("Final Bill: Rs. " + grandTotal);
	}
}