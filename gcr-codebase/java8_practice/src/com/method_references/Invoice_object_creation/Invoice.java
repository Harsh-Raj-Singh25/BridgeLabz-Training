package com.method_references.Invoice_object_creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
	private String transactionId;

	public Invoice(String transactionId) {
		this.transactionId = transactionId;
		System.out.println("Invoice Created for ID: " + transactionId);
	}
}
