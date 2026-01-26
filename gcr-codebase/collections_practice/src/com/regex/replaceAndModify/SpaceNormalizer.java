package com.regex.replaceAndModify;

public class SpaceNormalizer {
	public static void main(String[] args) {
		String input = "This    is an    example  with    multiple spaces.";

		// Regex Breakdown:
		// \\s : Matches any whitespace character (space, tab, newline)
		// + : Matches one or more occurrences of the preceding element
		String regex = "\\s+";

		// Replace all sequences of spaces with a single literal space
		String output = input.replaceAll(regex, " ");

		System.out.println("Original: [" + input + "]");
		System.out.println("Cleaned:  [" + output + "]");
	}
}