package com.Algorithm_Analysis.search_Algorithms;

import java.util.Arrays;

public class Comparison {
	public static void main(String[] args) {
		int n=1_000_000;
		int [] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=i;
		}
		
		int target=n-1;
		
		// for linear search
		long linearStart=System.nanoTime();
		int linearResult=LinearSearch.linearSearch(data, target);
		long linearEnd=System.nanoTime();
		
		// for binary Search
		long binaryStart=System.nanoTime();
		Arrays.sort(data);
		int binaryResult=Binary.search(data, target);
		long binaryEnd=System.nanoTime();
		
		// displaying results
		System.out.println(" For Linear Search:");
		System.out.println(" Index :"+linearResult);
		System.out.println("Time taken :"+ (linearEnd - linearStart)+" ns");
		System.out.println();
		
		System.out.println(" For Binary Search");
		System.out.println(" Index:"+ binaryResult);
		System.out.println(" Time Taken :"+(binaryEnd - binaryStart)+ " ns");
	}
	
}
