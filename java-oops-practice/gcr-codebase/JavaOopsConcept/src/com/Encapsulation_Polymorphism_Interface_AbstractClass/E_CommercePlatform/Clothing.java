package com.Encapsulation_Polymorphism_Interface_AbstractClass.E_CommercePlatform;

class Clothing extends Product implements Taxable {
	public Clothing(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public double calculateDiscount() {
		return getPrice() * 0.20;
	} // 20% Off

	@Override
	public double calculateTax(double amount) {
		return amount * 0.05;
	} // 5% GST

	@Override
	public String getTaxDetails() {
		return "5% Apparel GST";
	}
}
