package com.exceptionHandling.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseDemo {
	public static void main(String[] args) {
		// Path to the file
		String fileName = "C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\Source.txt";

		// Declare resource inside the try parentheses
		// This ensures the BufferedReader is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			//Read the first line
			String firstLine = br.readLine();

			if (firstLine != null) {
				System.out.println(" First line of the file: " + firstLine);
			} else {
				System.out.println(" The file is empty.");
			}

		} catch (IOException e) {
			// Handle file not found or reading errors
			System.out.println(" Error reading file: " + e.getMessage());
		}
	}
}
