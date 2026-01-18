package com.Algorithm_Analysis.dataStructures;

public class ArraySearch {
	// linear search
	public static boolean search(int[] arr, int target) {
		for (int value : arr) {
			if (value == target) {
				return true;
			}
		}
		return false;
	}
}
