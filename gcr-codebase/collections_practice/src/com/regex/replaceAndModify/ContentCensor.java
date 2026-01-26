package com.regex.replaceAndModify;

public class ContentCensor {
	public static void main(String[] args) {
		String input = "This is a damn bad example with some stupid words.";

		// Define the list of words to censor
		String[] blackList = { "damn", "stupid", "bad" };

		// Build a regex like: \b(damn|stupid|bad)\b
		// Using String.join makes it easy to add the OR pipe |
		String regex = "\\b(" + String.join("|", blackList) + ")\\b";

		// Replace all matches with asterisks
		//   (?i) at the start if you want it to be case-insensitive
		String output = input.replaceAll("(?i)" + regex, "****");

		System.out.println("Input:  " + input);
		System.out.println("Output: " + output);
	}
}
