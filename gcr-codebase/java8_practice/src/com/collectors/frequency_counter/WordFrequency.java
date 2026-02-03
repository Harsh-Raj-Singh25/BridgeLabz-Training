package com.collectors.frequency_counter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * 2. Word Frequency Counter
○ Scenario: Analyze a paragraph for word occurrence.
○ Task: Use Collectors.toMap().
 */
public class WordFrequency {
	public static void main(String[] args) {
		String str="Harsh Raj Singh is one of the most iconic rulers of the India. Before he ascended to the throne, India was suffering from internal conflicts based on religion, caste, language and state. He solved all the issues and made the country heaven.";
		
		// using grouping + counting
		System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x -> x ,Collectors.counting())));
		
		// using .toMap
		// here s-> s for word, word -> 1 = initial count . Integer :: sum == If word exists, add 1 to the current value
		System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.toMap(s -> s, c -> 1, (s,c) -> s+c   )));
		
	}
}
