package com.Searching.SearchingAlgorithms;
import java.util.*;
public class FinalChallenge {
	public static int firstMissingPositive(int [] array) {
		boolean visited[]=new boolean[array.length+1];
		for(int a:array) {
			if(a>0 && a<=array.length) {
				visited[a]=true;
			}
		}
		
		// checking the first missing positive number
		for(int i=1;i<array.length;i++) {
			if(!visited[i]) {
				return i;
			}
		}
		return array.length+1;
	}
	// BinarySearch
	public static int binarySearch(int [] arr,int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(target==arr[mid]) {
				return mid;
			}else if(target>arr[mid]) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String [] args) {
		int array[]= {1,2,-3,4,6,7,8,10,17};
		int target=8;
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(array));
		
		System.out.println("The first missing positive integer in the array is :"+ firstMissingPositive(array));
		
		
		Arrays.sort(array);
		int targetIndex=binarySearch(array,target);
		if(targetIndex !=-1) {
			System.out.println("Target found at index :" +targetIndex);
		}else {
			System.out.println("Target not foumd");
		}
	}
}
