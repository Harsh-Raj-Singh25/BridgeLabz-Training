package com.Generics.SmartWareHouseManagementSystem;

class Groceries extends WarehouseItem {
	Groceries(String name, double weight) {
		super(name, weight);
	}

	void displayDetails() {
		System.out.println("[Groceries] Item: " + name + ", Weight: " + weight + "kg");
	}
}
