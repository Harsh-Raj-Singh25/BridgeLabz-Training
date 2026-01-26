package com.streams.readLineByLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class LargeLogScanner {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\Source.txt"; // Path to your large file
		String searchKeyword = "error";
		int matchCount = 0;

		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println(" File not found: " + filePath);
			return;
		}

		System.out.println(" Scanning large log file for '" + searchKeyword + "' entries...");

		//  Using try-with-resources for safe I/O
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;

			// Read line by line until EOF
			while ((line = reader.readLine()) != null) {
				// Case-insensitive search
				if (line.toLowerCase().contains(searchKeyword)) {
					System.out.println(line);
					matchCount++;
				}
			}

			System.out.println("\n--- Scan Complete ---");
			System.out.println("Total '" + searchKeyword + "' entries found: " + matchCount);

		} catch (IOException e) {
			System.err.println(" Error reading the file: " + e.getMessage());
		}
	}
}