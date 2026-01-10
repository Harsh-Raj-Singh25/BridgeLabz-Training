package com.HashMapsHashFunctions;

import java.util.HashMap;

public class TwoSum {
	public static int[] findTwoSum(int[] num, int target) {
		// initializing the hashmap
		HashMap<Integer, Integer> visitedNumbers = new HashMap<>();

		// iterating through the array
		for(int i=0;i<num.length;i++) {
			int temp=num[i];
			// calculaating the missing place
			int complement=target-temp;
			if(visitedNumbers.containsKey(complement)) {
				return new int[] {visitedNumbers.get(complement),i};
			}
			visitedNumbers.put(temp, i);
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		int numbers[]= {2,11,7,15};
		int target=9;
		
		int [] result=findTwoSum(numbers,target);
		
		if(result.length==2) {
			System.out.println("Indices :["+result[0]+", "+result[1]+"]");
		
		}else {
			System.out.println("No Solution found");
		}
	}
	
}
