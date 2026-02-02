package com.functional_interface.default_methods.data_export;

public class ReportManager {
	public static void main(String[] args) {
		System.out.println("--- Testing Financial Report ---");
		Report finance = new FinancialReport();
		finance.exportToCSV();
		finance.exportToPDF();
		// Calling the default method inherited from the interface
		finance.exportToJSON();

		System.out.println("\n--- Testing Inventory Report ---");
		Report inventory = new InventoryReport();
		inventory.exportToPDF();
		// Calling the overridden version
		inventory.exportToJSON();
	}
}