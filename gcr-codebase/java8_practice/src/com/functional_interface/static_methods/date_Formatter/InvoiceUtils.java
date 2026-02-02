package com.functional_interface.static_methods.date_Formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface InvoiceUtils {
	static String formatInvoiceDate(LocalDateTime date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
		return date.format(formatter);
	}
}

