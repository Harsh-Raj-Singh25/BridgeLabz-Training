package com.collections.set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	public static void symmetricdifference(Set<Integer> set1, Set <Integer> set2) {
		// union
		Set<Integer> union=new HashSet<>(set1);
		union.addAll(set2);
		
		// intersection
		Set<Integer> intersection =new HashSet<>(set1);
		intersection.retainAll(set2);
		
		// Symmetric difference =union - intersection
		union.removeAll(intersection);
		
		System.out.println(" Symmetric Difference :"+union);
	}
	
	public static void main(String[] args) {
		Set <Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4));
		Set <Integer> set2=new HashSet<>(Arrays.asList(3,4,5,6));
		
		symmetricdifference(set1, set2);
	}
}
