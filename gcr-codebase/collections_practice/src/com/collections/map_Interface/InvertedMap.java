package com.collections.map_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertedMap {
	@SuppressWarnings("unchecked")
	public static Map<Integer, List> invertMap(Map<String, Integer> map) {
		Map<Integer, List> inverted = new HashMap<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			Integer newValue = entry.getValue();
			String newEntry = entry.getKey();

			// computeIfAbsent checks if the key exists.
			// If not, it creates a new ArrayList. Then we add our string.
			inverted.computeIfAbsent(newValue, k -> new ArrayList<>()).add(newEntry);
		}

		return inverted;
	}

	public static void main(String[] args) {
		Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1);
		System.out.println("Original: " + input);
		System.out.println("Inverted: " + invertMap(input));
	}
}
