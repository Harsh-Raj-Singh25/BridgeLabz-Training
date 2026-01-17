package com.day5_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps
 */
public class CropMonitorQuickSort {
	// Standard Quick Sort Implementation
		public static void quickSort(double[] tickets, int low, int high) {
			if (low < high) {
				// Partition the array and get the pivot index
				int pi = partition(tickets, low, high);

				// Recursively sort elements before and after partition
				quickSort(tickets, low, pi - 1);
				quickSort(tickets, pi + 1, high);
			}
		}

		private static int partition(double[] tickets, int low, int high) {
			// Choosing the last element as pivot
			double pivot = tickets[high];
			int i = (low - 1); // Index of smaller element

			for (int j = low; j < high; j++) {
				// If current element is smaller than or equal to pivot
				if (tickets[j] <= pivot) {
					i++;
					// Swap tickets[i] and tickets[j]
					double temp = tickets[i];
					tickets[i] = tickets[j];
					tickets[j] = temp;
				}
			}

			// Swap the pivot element to its correct position
			double temp = tickets[i + 1];
			tickets[i + 1] = tickets[high];
			tickets[high] = temp;

			return i + 1;
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			// initializing data array
			double [] data= new double [5];
			System.out.println("Enter the temperatures :");
			
			for(int i=0;i<data.length;i++) {
				data[i]=sc.nextDouble();
			}
			
			quickSort(data,0,data.length-1);
			System.out.println("The data in an ascending order is :");
			System.out.println(Arrays.toString(data));
		}
}
