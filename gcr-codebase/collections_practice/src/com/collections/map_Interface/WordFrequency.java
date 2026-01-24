package com.collections.map_Interface;
/*
 * Map Interface
Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
 */
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	public static Map<String , Integer> countWords(String input){
		Map<String , Integer> map=new HashMap<>();
		
		String cleanedInput=input.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
		//  Split by one or more whitespace characters
        String[] words = cleanedInput.split("\\s+");
		
        for(String word:words) {
        	map.put(word, map.getOrDefault(word,0)+1);
        }
		return map;
	}
	public static void main(String[] args) {
		String text="Harsh is one of the mightiest ruler of the 21st century. He is going to transform this world";
		
		System.out.println("The frequency of words :\n"+ countWords(text));
		
	}
}

