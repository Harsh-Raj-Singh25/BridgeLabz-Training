package com.Encapsulation_Polymorphism_Interface_AbstractClass.E_CommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class ECommerceMain {
	public static void main(String[] args) {
		List<Product> cart = new ArrayList<>();

		cart.add(new Electronics(101, "Laptop", 50000));
		cart.add(new Clothing(202, "Jeans", 2000));
		cart.add(new Groceries(303, "Rice (5kg)", 500));

		System.out.println("---------- SHOPPING CART RECEIPT ----------");
		processCart(cart);
	}

	public static void processCart(List<Product> cart) {
		double grandTotal = 0;

		for (Product p : cart) {
			double discount = p.calculateDiscount();
			double priceAfterDiscount = p.getPrice() - discount;
			double tax = 0;

			// Polymorphism check: Is this specific product taxable?
			if (p instanceof Taxable) {
				tax = ((Taxable) p).calculateTax(priceAfterDiscount);
			}

			double finalPrice = priceAfterDiscount + tax;
			grandTotal += finalPrice;

			p.showBaseDetails();
			System.out.printf(" | Tax: %.2f | Final: Rs. %.2f%n", tax, finalPrice);
		}

		System.out.println("-------------------------------------------");
		System.out.printf("TOTAL PAYABLE: Rs. %.2f%n", grandTotal);
	}
}