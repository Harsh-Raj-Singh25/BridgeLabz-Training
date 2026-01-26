package com.regex.advancedProblems;

import java.util.regex.Pattern;

public class CreditCardValidator {
	public static void main(String[] args) {
		// Visa: Starts with 4, then 15 digits. MasterCard: Starts with 5, then 15
		// digits.
		String visaRegex = "^4[0-9]{15}$";
		String mcRegex = "^5[0-9]{15}$";

		String card = "4123456789012345";
		System.out.println("Visa Valid: " + Pattern.matches(visaRegex, card));
		System.out.println("MasterCard Valid: " + Pattern.matches(mcRegex, card));
	}
}
