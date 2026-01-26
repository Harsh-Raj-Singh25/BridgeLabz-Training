package com.regex.extraction_Problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
	public static void main(String[] args) {
		String text = "The events are scheduled for 12/05/2026, 15/08/2026, and 29/02/2026.";

		// Regex: 2 digits, slash, 2 digits, slash, 4 digits
		String dateRegex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

		Pattern pattern = Pattern.compile(dateRegex);
		Matcher matcher = pattern.matcher(text);

		System.out.println("--- Extracted Dates ---");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
