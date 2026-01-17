package com.day5_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions

 */
public class RoboWarehouseInsertionSort {
	public static void insertionSort(int [] array) {
		int n=array.length;
		int key, j;
		for(int i=1;i<n;i++) {
			key=array[i];
			j=i-1;
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j--;
						
			}
			array[j+1]=key;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// initializing weight array
		int [] weights= new int [5];
		System.out.println("Enter the weight of packages :");
		
		for(int i=0;i<weights.length;i++) {
			weights[i]=sc.nextInt();
		}
		
		insertionSort(weights);
		System.out.println("The packages on shelves in an ascending order are:");
		System.out.println(Arrays.toString(weights));
	}
}
