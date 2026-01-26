package com.reflection.advance_level.jsonRepresentation;

public class JsonRepresentationMain {
	public static void main(String[] args) {
		try {
			// Create a sample object
			Product laptop = new Product(101, "MacBook Pro", 70099, true);

			// Convert object to JSON string using Reflection
			String jsonOutput = JsonGenerator.stringify(laptop);

			// Print the result
			System.out.println("--- Generated JSON Output ---");
			System.out.println(jsonOutput);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
