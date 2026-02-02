package com.stream_API.basic.nameSorting;

import java.util.Arrays;
import java.util.List;

public class NameSorter {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("Harsh","Namrata","Anand","Ajay","Ayushman","Raj","Singh","Khapre");
		// using streams with map and sorted to transform data and then printing with help of for each 
		list.stream()
		.map(r -> r.toUpperCase()).sorted().forEach(System.out::println);
		
	}
}
