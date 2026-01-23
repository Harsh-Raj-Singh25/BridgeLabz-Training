package com.collections.set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Set Interface
Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.

 */
public class EqualityCheck {
	public static boolean checkEquality(Set<Integer> set1, Set <Integer> set2) {
		if(set1.size()!=set2.size()) {
			return false;
		}
		return set1.equals(set2);
		
		
		//return false;
		
	}
	public static void main(String[] args) {
		Set <Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
		Set <Integer> set2=new HashSet<>(Arrays.asList(3,2,1));
		
		System.out.println(" The two sets are equal:"+checkEquality(set1,set2));
		
	}
}
