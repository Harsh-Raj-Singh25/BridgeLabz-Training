package com.regex.advancedProblems;

import java.util.regex.*;

public class CurrencyExtractor {
	public static void main(String[] args) {
		String text = "The price is Rs.2445.99, and the discount is 400.";
		// Match optional $, then digits, then optional . and more digits
		String regex = "\\$?\\d+\\.\\d{2}";

		Matcher m = Pattern.compile(regex).matcher(text);
		while (m.find()) {
			System.out.println("Currency: " + m.group());
		}
	}
}