package com.method_references.Invoice_object_creation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinanceSystem {
	public static void main(String[] args) {
		List<String> transactionIds = Arrays.asList("TXN001", "TXN002", "TXN003");

		// Constructor Reference: Invoice::new
		List<Invoice> invoices = transactionIds.stream().map(Invoice ::new) // Shorthand for id -> new Invoice(id)
				.collect(Collectors.toList());
	}
}