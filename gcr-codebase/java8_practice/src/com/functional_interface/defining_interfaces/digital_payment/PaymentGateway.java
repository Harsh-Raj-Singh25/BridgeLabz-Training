package com.functional_interface.defining_interfaces.digital_payment;

public class PaymentGateway {
	public static void processTransaction(PaymentMethod method, double amount) {
		method.pay(amount);
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE PAYMENT SYSTEM");
		// User chooses UPI
		processTransaction(new UPI(), 1500.0);

		// User chooses Credit Card
		processTransaction(new CreditCard(), 50000.0);
	}
}