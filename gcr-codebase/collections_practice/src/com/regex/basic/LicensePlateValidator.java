package com.regex.basic;

import java.util.regex.Pattern;

public class LicensePlateValidator {
	public static void main(String[] args) {
		// Pattern Breakdown:
		// ^ : Start of string
		// [A-Z] : Any uppercase letter
		// {2} : Exactly two occurrences
		// [0-9] : Any digit
		// {4} : Exactly four occurrences
		// $ : End of string
		String regex = "^[A-Z]{2}[0-9]{4}$";

		String[] testPlates = { "AB1234", "A12345", "AB123", "XY9999", "ab1234" };

		for (String plate : testPlates) {
			System.out.println(plate + " -> " + Pattern.matches(regex, plate));
		}
	}
}