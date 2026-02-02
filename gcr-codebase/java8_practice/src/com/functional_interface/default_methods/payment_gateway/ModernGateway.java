package com.functional_interface.default_methods.payment_gateway;

class ModernGateway implements PaymentProcessor {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing modern payment...");
	}

	@Override
	public void refund(double amount) {
		System.out.println("Modern Gateway: Refund of $" + amount + " processed to original source.");
	}
}
