package com.collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		
		// partitioning
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(l1.stream().collect(Collectors.partitioningBy(x -> x%2==0)));
		
		// summing values
		Map<String , Integer> map=new HashMap<>();
		map.put("Apple",5);
		map.put("Mangp", 10);
		
		System.out.println(map.values().stream().reduce(Integer::sum).orElse(0)); // .orElse to avoid optional class. orElse(0) avoids nullpointerException
		System.out.println(map.values().stream().collect(Collectors.summingInt(x -> x)));
		
		  
	
		
	}
}
