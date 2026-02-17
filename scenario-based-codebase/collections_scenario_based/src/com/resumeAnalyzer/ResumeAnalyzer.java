package com.resumeAnalyzer;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;
import java.util.stream.*;

public class ResumeAnalyzer {
	// Regex Patterns
	private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
	private static final Pattern PHONE_PATTERN = Pattern.compile("\\+?\\d{10,12}");
	private static final Pattern KEYWORD_PATTERN = Pattern.compile("(?i)(Java|Python|Spring|SQL|React)");

	private Map<String, ResumeData> candidateMap = new HashMap<>();

	public void processFolder(String folderPath) {
		File folder = new File(folderPath);
		File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

		if (files == null )
			return;

		for (File file : files) {
			try {
				processFile(file);
			} catch (IOException e) {
				System.err.println("Skipping " + file.getName() + " due to read error.");
			}
		}
	}

	private void processFile(File file) throws IOException {
		// I/O Streams: Reading the file content
		String content = Files.readString(file.toPath());

		// Regex: Extracting Data
		String email = findFirst(content, EMAIL_PATTERN, "UnknownEmail");
		String phone = findFirst(content, PHONE_PATTERN, "NoPhone");

		// Count keyword occurrences
		int matches = 0;
		Matcher m = KEYWORD_PATTERN.matcher(content);
		while (m.find())
			matches++;

		// Collections: Storing in Map
		candidateMap.put(email, new ResumeData(email, phone, matches, file.getName()));
	}

	private String findFirst(String content, Pattern pattern, String defaultValue) {
		Matcher m = pattern.matcher(content);
		return m.find() ? m.group() : defaultValue;
	}

	public void displaySortedCandidates() {
		// Collections: Sorting the values
		List<ResumeData> sortedList = new ArrayList<>(candidateMap.values());
		Collections.sort(sortedList);

		System.out.println("---  Ranked Candidates (by Keyword Match) ---");
		sortedList.forEach(System.out::println);
	}

	public static void main(String[] args) {
		ResumeAnalyzer analyzer = new ResumeAnalyzer();
		// Point to your resume folder
		analyzer.processFolder("./resumes");
		analyzer.displaySortedCandidates();
	}
}