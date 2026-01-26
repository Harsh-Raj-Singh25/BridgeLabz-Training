package com.regex.extraction_Problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
	public static void main(String[] args) {
		String text = "Visit https://www.google.com and http://example.org for more info.";

		// Regex for http or https links
		String linkRegex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}[/\\w.-]*";

		Pattern pattern = Pattern.compile(linkRegex);
		Matcher matcher = pattern.matcher(text);

		System.out.println("--- Extracted Links ---");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}