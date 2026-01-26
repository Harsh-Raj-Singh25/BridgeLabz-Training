package com.streams.countWords;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String filePath ="C:\\Users\\HP5CD\\Desktop\\BridgeLabz-Training\\gcr-codebase\\collections_practice\\src\\com\\streams\\fileHandling\\Source.txt";
		Map<String, Integer> wordCounts = new HashMap<>();

		// Read the file efficiently
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				//  Tokenize: Split by whitespace and remove punctuation
				// This regex splits by any non-alphabetical character
				String[] words = line.toLowerCase().split("[^a-zA-Z]+");

				for (String word : words) {
					if (!word.isEmpty()) {
						wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
					}
				}
			}

			//  Sort by Value (Frequency) and get Top 5
			List<Map.Entry<String, Integer>> top5 = wordCounts.entrySet().stream()
					.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(5)
					.collect(Collectors.toList());

			// Display Results
			System.out.println(" --- Top 5 Most Frequent Words ---");
			if (top5.isEmpty()) {
				System.out.println("No words found in the file.");
			} else {
				for (Map.Entry<String, Integer> entry : top5) {
					System.out.printf("%-10s : %d times\n", entry.getKey(), entry.getValue());
				}
			}

		} catch (FileNotFoundException e) {
			System.err.println(" Error: The file was not found.");
		} catch (IOException e) {
			System.err.println(" Error reading the file: " + e.getMessage());
		}
	}
}