package com.functional_interface.static_methods.date_Formatter;

import java.time.LocalDateTime;

public class BillingSystem {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		// Accessing via Interface Name
		System.out.println("Invoice Issued On: " + InvoiceUtils.formatInvoiceDate(now));
	}
}