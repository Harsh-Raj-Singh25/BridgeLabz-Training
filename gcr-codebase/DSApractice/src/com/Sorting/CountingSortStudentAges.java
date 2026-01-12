package com.Sorting;

import java.util.Scanner;

public class CountingSortStudentAges {

	public static void countingSort(int[] arr) {

		int minAge = 10;
		int maxAge = 18;
		int range = maxAge - minAge + 1;

		int[] count = new int[range];
		int[] output = new int[arr.length];

		// Count frequency of each age
		for (int age : arr) {
			count[age - minAge]++;
		}

		// Cumulative frequency
		for (int i = 1; i < range; i++) {
			count[i] += count[i - 1];
		}

		// Place elements in correct position (stable sort)
		for (int i = arr.length - 1; i >= 0; i--) {
			int age = arr[i];
			int index = count[age - minAge] - 1;
			output[index] = age;
			count[age - minAge]--;
		}

		// Copy back to original array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		int[] ages = new int[n];

		System.out.println("Enter student ages (10 to 18):");
		for (int i = 0; i < n; i++) {
			ages[i] = sc.nextInt();
		}

		// Counting Sort
		countingSort(ages);

		System.out.println("Sorted Student Ages (Ascending):");
		for (int age : ages) {
			System.out.print(age + " ");
		}

		sc.close();
	}

}
