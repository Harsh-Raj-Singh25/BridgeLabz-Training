package com.collections.set_Interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 *  
Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}.

 */
public class UnionAndIntersection {
	public static void main(String[] args) {
		Set <Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4));
		Set <Integer> set2=new HashSet<>(Arrays.asList(3,4,5,6));
		
		Set<Integer> union=new HashSet<>(set1);
		union.addAll(set2);
		
		// intersection
		Set<Integer> intersection =new HashSet<>(set1);
		intersection.retainAll(set2);
		
		System.out.println(" The union is :"+union);
		System.out.println(" The intersection is  :"+intersection);
		
	}
}
