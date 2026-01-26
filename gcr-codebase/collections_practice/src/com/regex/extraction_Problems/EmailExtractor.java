package com.regex.extraction_Problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
	public static void main(String[] args) {
		String text = "Contact us at support@example.com and info@company.org";

		// Regex for standard email format
		String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(text);

		System.out.println("--- Extracted Emails ---");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}