package com.HashMapsHashFunctions.CustomHashMap;

public class Main {
	public static void main(String[] args) {
		MyHashMap<String, Integer> map = new MyHashMap<>();

		map.put("Apple", 100);
		map.put("Banana", 50);
		map.put("Orange", 80);

		System.out.println("Value for Apple: " + map.get("Apple"));
		System.out.println("Size: " + map.size()); // 3

		map.remove("Banana");
		System.out.println("Value for Banana after removal: " + map.get("Banana")); // null
		System.out.println("New Size: " + map.size()); // 2
	}
}
