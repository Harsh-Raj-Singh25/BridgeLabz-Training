package com.regex.advancedProblems;

import java.util.regex.Pattern;

public class SSNValidator {
	public static void main(String[] args) {
		String ssnRegex = "^\\d{3}-\\d{2}-\\d{4}$";

		String[] testSSNs = { "123-45-6789", "123456789", "12-345-6789" };
		for (String ssn : testSSNs) {
			System.out.println(ssn + " Valid: " + Pattern.matches(ssnRegex, ssn));
		}
	}
}