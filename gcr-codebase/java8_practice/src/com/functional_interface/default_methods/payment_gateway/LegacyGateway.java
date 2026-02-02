package com.functional_interface.default_methods.payment_gateway;

class LegacyGateway implements PaymentProcessor {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing legacy payment of Rs." + amount);
	}
	// Uses the default refund() automatically

}