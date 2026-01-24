package com.collections.map_Interface;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
//	public static <K, V> Map<K,V> mergeMaps(Map<K,V> map1, Map <K,V> map2){
//		Map<K,V> result=new HashMap<>(map1);
//		
//		for( K k : map2.keySet()) {
//			V value=map2.get(k);
////			result.put(k, result.getOrDefault(k,0)+1);
//			// 3. Check if result already has this key
//			if (result.containsKey(k)) {
//	            // Use the provided merger function to combine them
//	            result.put(k, merger.apply(result.get(k), value2));
//	        } else {
//	            result.put(k, value2);
//	        }
//			
//		}
//		
//		
//		return result;
//		
//	}
	// alternate
	public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
		// Start with a copy of map1
		Map<String, Integer> result = new HashMap<>(map1);

		for (String k : map2.keySet()) {
			Integer value2 = map2.get(k);

			if (result.containsKey(k)) {
				// Now '+' works because these are Integers!
				result.put(k, result.get(k) + value2);
			} else {
				result.put(k, value2);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// We use HashMap to ensure the maps are modifiable
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

		// Merge map2 into map1
//		map2.forEach((key, value) -> map1.merge(key, value, (oldVal, newVal) -> oldVal + newVal));
		
		

		System.out.println("Merged Map: " + mergeMaps(map1,map2)); 
	}
}
