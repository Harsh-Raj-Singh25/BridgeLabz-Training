package com.lambda.e_commerce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ShoppingSystem {
	public static void main(String[] args) {
		List<Product> cart = new ArrayList<>(Arrays.asList(new Product("Laptop", 1200.0), new Product("Mouse", 25.0),
				new Product("Keyboard", 450.0)));

		// 1. 10% Discount
		UnaryOperator<Double> applyDiscount = p -> p * 0.90;
		System.out.println("Discounted Price of Laptop: " + applyDiscount.apply(1200.0));

		// 2. Sort by price
		cart.sort((p1, p2) -> Double.compare(p1.price, p2.price));

		// 3. Free delivery eligibility (> 500)
		Predicate<Double> isFreeDelivery = amt -> amt > 500;
		System.out.println("Is Mouse eligible for free delivery? " + isFreeDelivery.test(25.0));

		// 4. Calculate final bill
		double total = cart.stream().mapToDouble(p -> p.price).sum();
		System.out.println("Total Bill: Rs." + total);

		// 5. Print product names
		cart.forEach(p -> System.out.println("Product: " + p.name));
	}
}