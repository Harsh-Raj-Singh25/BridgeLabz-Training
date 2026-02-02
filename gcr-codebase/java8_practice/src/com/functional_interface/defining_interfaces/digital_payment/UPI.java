package com.functional_interface.defining_interfaces.digital_payment;

class UPI implements PaymentMethod {
	public void pay(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount + ". Verifying VPA...");
	}
}