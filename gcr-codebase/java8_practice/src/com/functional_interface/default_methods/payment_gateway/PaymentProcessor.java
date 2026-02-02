package com.functional_interface.default_methods.payment_gateway;

interface PaymentProcessor {
	void processPayment(double amount);

	// Default method: Old providers won't break
	default void refund(double amount) {
		System.out.println("Generic Refund: This provider does not support automated refunds yet.");
	}
} 
