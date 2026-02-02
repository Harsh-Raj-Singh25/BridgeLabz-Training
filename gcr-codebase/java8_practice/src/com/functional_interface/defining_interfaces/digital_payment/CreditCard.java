package com.functional_interface.defining_interfaces.digital_payment;

class CreditCard implements PaymentMethod {
	public void pay(double amount) {
		System.out.println("Processing Credit Card payment of ₹" + amount + ". Redirecting to Bank OTP...");
	}
}
