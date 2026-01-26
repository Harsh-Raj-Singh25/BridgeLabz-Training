package com.regex.basic;

import java.util.regex.Pattern;

public class HexColorValidator {
	public static void main(String[] args) {
		// Pattern Breakdown:
		// ^ : Start of string
		// # : Must start with a literal '#'
		// [a-fA-F0-9]: Allows digits and letters A through F (both cases)
		// {6} : Must be exactly 6 characters long
		// $ : End of string
		String regex = "^#[a-fA-F0-9]{6}$";

		String[] colors = { "#FFA500", "#ff4500", "#123", "#G12345", "#ABCDEF1" };

		for (String color : colors) {
			System.out.println(color + " -> " + Pattern.matches(regex, color));
		}
	}
}
