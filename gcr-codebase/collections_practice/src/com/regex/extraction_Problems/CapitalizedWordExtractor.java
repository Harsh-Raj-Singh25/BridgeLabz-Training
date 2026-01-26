package com.regex.extraction_Problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordExtractor {
	public static void main(String[] args) {
		String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

		// Regex for words starting with Uppercase followed by lowercase letters
		String capRegex = "\\b[A-Z][a-z]+\\b";

		Pattern pattern = Pattern.compile(capRegex);
		Matcher matcher = pattern.matcher(text);

		System.out.println("--- Capitalized Words ---");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}