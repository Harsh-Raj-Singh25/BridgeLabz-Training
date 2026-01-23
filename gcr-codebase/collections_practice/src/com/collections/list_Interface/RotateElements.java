package com.collections.list_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].

 */
public class RotateElements {
	public static void rotateList(List<Integer> lst, int position) {
		int size = lst.size();
		if (size == 0)
			return;
		position %= size;

		for (int i = 0; i < position; i++) {
			//  Store the first element
			Integer first = lst.get(0);

			//  Shift all elements to the left by 1
			for (int j = 0; j < size - 1; j++) {
				lst.set(j, lst.get(j + 1));
			}

			//  Put the stored element at the very end
			lst.set(size - 1, first);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(" Original List :" + list);
		rotateList(list, 2);
		System.out.println("Rotated List"+list);
	}
}
