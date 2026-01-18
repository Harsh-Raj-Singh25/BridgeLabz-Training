package com.day6_Sorting.IcecreamRush;

public class Flavor {
	String name;
	int quantity;

	Flavor(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	// display method
	void display() {
		System.out.println("Name of flavor:" + name + " | Quantity Sold : " + quantity);
	}
}
