package com.Generics.SmartWareHouseManagementSystem;

class Electronics extends WarehouseItem {
	Electronics(String name, double weight) {
		super(name, weight);
	}

	void displayDetails() {
		System.out.println("[Electronics] Item: " + name + ", Weight: " + weight + "kg");
	}
}
