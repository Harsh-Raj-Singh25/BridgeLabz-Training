package com.functional_interface.default_methods.data_export;

class FinancialReport implements Report {
	@Override
	public void exportToCSV() {
		System.out.println("Exporting Finance Report to CSV...");
	}

	@Override
	public void exportToPDF() {
		System.out.println("Exporting Finance Report to PDF...");
	}

	// Notice: exportToJSON() is NOT overridden here.
}