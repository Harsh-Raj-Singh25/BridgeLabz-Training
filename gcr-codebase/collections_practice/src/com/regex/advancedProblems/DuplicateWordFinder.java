package com.regex.advancedProblems;

import java.util.regex.*;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String text = "This is is a repeated repeated word test.";
		// \\b(\\w+) : Capture a word
		// \\s+ : Followed by space
		// \\1 : Followed by the EXACT same word captured earlier
		String regex = "\\b(\\w+)\\s+\\1\\b";

		Matcher m = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);
		while (m.find()) {
			System.out.println("Repeated word: " + m.group(1));
		}
	}
}