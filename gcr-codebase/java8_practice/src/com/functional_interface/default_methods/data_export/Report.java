package com.functional_interface.default_methods.data_export;

interface Report {
	void exportToCSV();

	void exportToPDF();

	// Default method: Added later to support new formats
	// without breaking existing implementing classes.
	default void exportToJSON() {
		System.out.println("Generating a basic JSON representation of the report data...");
	}
}




