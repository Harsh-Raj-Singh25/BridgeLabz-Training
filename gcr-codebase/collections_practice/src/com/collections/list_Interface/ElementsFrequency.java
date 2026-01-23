package com.collections.list_Interface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.*/

public class ElementsFrequency {
	public static Map<String, Integer> countFrequency(List<String> lst) {
		Map<String, Integer> map = new HashMap<>();
//		for (String item : lst) {
//			map.put(item, map.getOrDefault(item, 0) + 1);
//		}

		for (String str : lst) {
			// Check if key exists; if so, increment, otherwise set to 1
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

		System.out.println("Input     : " + items);
		System.out.println("Frequency : " + countFrequency(items));
		
	}
}
