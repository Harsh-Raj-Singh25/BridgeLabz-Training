package com.Encapsulation_Polymorphism_Interface_AbstractClass.E_CommercePlatform;

class Groceries extends Product {
	public Groceries(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	} // No discount on basic groceries

	// Groceries does not implement Taxable (Tax-free)
}