package com.day3.smartCheckout;

import java.util.*;
import java.util.Queue;

public class CheckoutCounter {
	// Inventory Database
	private Map<String, Product> inventory = new HashMap<>();
	// Waiting Line
	private Queue<Customer> customerQueue = new LinkedList<>();

	public void addProductToStore(String name, double price, int stock) {
		inventory.put(name, new Product(price, stock));
	}

	public void joinQueue(Customer c) {
		customerQueue.offer(c);
		System.out.println(  c.name + " joined the checkout line.");
	}

	public void processNextBilling() {
		if (customerQueue.isEmpty()) {
			System.out.println("No customers in line.");
			return;
		}

		Customer c = customerQueue.poll(); // Remove from front of queue
		double totalBill = 0;

		System.out.println("\n---  Billing for " + c.name + " ---");

		for (String itemName : c.shoppingCart) {
			if (inventory.containsKey(itemName)) {
				Product p = inventory.get(itemName);

				if (p.stock > 0) {
					totalBill += p.price;
					p.stock--; //  Requirement: Update stock on purchase
					System.out.println("- " + itemName + ": Rs." + p.price);
				} else {
					System.out.println("- " + itemName + ": [OUT OF STOCK]");
				}
			} else {
				System.out.println("- " + itemName + ": [NOT FOUND IN STORE]");
			}
		}
		System.out.println("TOTAL AMOUNT: Rs." + totalBill);
		System.out.println("---------------------------\n");
	}
}
