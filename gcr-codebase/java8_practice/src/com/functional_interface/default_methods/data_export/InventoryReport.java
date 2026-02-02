package com.functional_interface.default_methods.data_export;

class InventoryReport implements Report {
	@Override
	public void exportToCSV() {
		System.out.println("Exporting Inventory to CSV...");
	}

	@Override
	public void exportToPDF() {
		System.out.println("Exporting Inventory to PDF...");
	}

	// This class CHOOSES to override the default with specialized logic
	@Override
	public void exportToJSON() {
		System.out.println("Generating High-Performance JSON for Inventory Data...");
	}
}