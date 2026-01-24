package com.collections.map_Interface;

import java.util.Map;

public class HighestValue {
	public static void findHighestValue(Map<String, Integer> map) {
		int highestValue=0;
		String result="";
		for(String key:map.keySet()) {
			if(map.get(key)>highestValue) {
				highestValue=map.get(key);
				result=key;
			}
		}
		System.out.println("The key with the highest value is :"+result);
	}
	public static void main(String[] args) {
		Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1,"D",5);
		findHighestValue(input);
	}
}
