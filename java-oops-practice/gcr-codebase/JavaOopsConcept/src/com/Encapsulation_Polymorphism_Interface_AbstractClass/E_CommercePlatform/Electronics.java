package com.Encapsulation_Polymorphism_Interface_AbstractClass.E_CommercePlatform;

class Electronics extends Product implements Taxable {
	public Electronics(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10;
	} // 10% Off

	@Override
	public double calculateTax(double amount) {
		return amount * 0.18;
	} // 18% GST

	@Override
	public String getTaxDetails() {
		return "18% Electronics GST";
	}
}
