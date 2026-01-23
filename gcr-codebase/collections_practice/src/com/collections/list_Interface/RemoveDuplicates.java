package com.collections.list_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].


 */
public class RemoveDuplicates {
	public static void removeDuplicates(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			Integer key=list.get(i);
			for(int j=i+1;j<list.size();j++) {
				if (key.equals(list.get(j))) {
	                list.remove(j);
	                j--; // ⬅️ CRITICAL: Step back so we don't skip the next element
	            }
			}
		}
		System.out.println("List free of duplicates :"+list);
		
		
	}
	
	public static void main(String[] args) { 
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
		System.out.println("Original :"+ list);
		removeDuplicates(list);
		
		
	}
}
