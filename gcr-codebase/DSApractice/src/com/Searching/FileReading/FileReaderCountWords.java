package com.Searching.FileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCountWords {
	public static void main(String[] args) {
		String filePath = "src/com/Searching/FileReading/sample.txt";

		// word to search
		String targetWord = "Harsh";
		int count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Split line into words
				String[] words = line.split("\\s+");

				// Check each word
				for (String word : words) {
					if (word.equals(targetWord)) {
						count++;
					}
				}
			}

			System.out.println("Word \"" + targetWord + "\" appears " + count + " times.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
