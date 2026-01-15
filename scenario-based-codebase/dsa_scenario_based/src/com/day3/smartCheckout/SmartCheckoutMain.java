package com.day3.smartCheckout;

import java.util.Arrays;

public class SmartCheckoutMain {
	public static void main(String[] args) {
		CheckoutCounter counter = new CheckoutCounter();

		// Setup Store Inventory
		counter.addProductToStore("Milk", 2.50, 10);
		counter.addProductToStore("Bread", 1.80, 5);
		counter.addProductToStore("Eggs", 3.00, 2);

		// Create Customers
		Customer c1 = new Customer("Harsh", Arrays.asList("Milk", "Eggs", "Bread"));
		Customer c2 = new Customer("Rahul", Arrays.asList("Eggs", "Eggs", "Eggs")); // Will hit stock limit

		// Simulation
		counter.joinQueue(c1);
		counter.joinQueue(c2);

		counter.processNextBilling(); // Processes Harsh
		counter.processNextBilling(); // Processes Rahul (Shows out of stock for 3rd egg)
	}
}
