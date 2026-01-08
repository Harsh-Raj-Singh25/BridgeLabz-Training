package com.Searching.SearchingAlgorithms;

public class LinearSearchFirstNegativeNumber {
	public static int linearSearch(int [] array) {
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array= {5,4,8,10,-5,4,-8,-9,10};
		int index=linearSearch(array);
		if(index>=0) {
			System.out.println("The first negative number in the array is at :"+index+" index");
		}else {
			System.out.println("The negative integer not found;");
		}
	}
}
