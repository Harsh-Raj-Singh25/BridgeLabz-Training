package com.functional_interface.default_methods.payment_gateway;


public class PaymentGatewaySystem {
	public static void main(String[] args) {
		PaymentProcessor oldOne = new LegacyGateway();
		oldOne.refund(100); // Prints generic message

		PaymentProcessor newOne = new ModernGateway();
		newOne.refund(100); // Prints custom logic
	}
}