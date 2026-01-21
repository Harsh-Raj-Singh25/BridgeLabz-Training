package com.Generics.SmartWareHouseManagementSystem;

import java.util.List;

public class WarehouseSystem {

	// Wildcard method: Accepts a list of ANY subclass of WarehouseItem
	public static void displayInventory(List<? extends WarehouseItem> items) {
		System.out.println("\n---  Current Inventory Audit ---");
		for (WarehouseItem item : items) {
			item.displayDetails();
		}
	}

	public static void main(String[] args) {
		// Create specific storage units
		Storage<Electronics> techStorage = new Storage<>();
		Storage<Groceries> foodStorage = new Storage<>();

		// Add items (Type Safety is maintained)
		techStorage.addItem(new Electronics("Laptop", 2.5));
		foodStorage.addItem(new Groceries("Apples", 5.0));

		// techStorage.addItem(new Groceries("Milk", 1.0)); //  COMPILE ERROR! Safe.

		// Use Wildcard method to display different types of storage
		displayInventory(techStorage.getItems());
		displayInventory(foodStorage.getItems());
	}
}