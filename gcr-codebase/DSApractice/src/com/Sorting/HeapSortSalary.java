package com.Sorting;

import java.util.Scanner;

public class HeapSortSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of applicants: ");
		int n = sc.nextInt();

		int[] salaries = new int[n];

		System.out.println("Enter expected salary demands:");
		for (int i = 0; i < n; i++) {
			salaries[i] = sc.nextInt();
		}

		// Perform Heap Sort
		heapSort(salaries);

		System.out.println("Sorted Salary Demands (Ascending):");
		for (int salary : salaries) {
			System.out.print(salary + " ");
		}

		sc.close();
	}

	// Heap Sort function
	public static void heapSort(int[] arr) {
		int n = arr.length;

		// Step 1: Build Max Heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Step 2: Extract elements one by one
		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Heapify reduced heap
			heapify(arr, i, 0);
		}
	}

	// Heapify subtree rooted at index i
	public static void heapify(int[] arr, int n, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		// If left child is larger
		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}

		// If right child is larger
		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}

		// If largest is not root
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			// Recursively heapify the affected subtree
			heapify(arr, n, largest);
		}
	}
}
