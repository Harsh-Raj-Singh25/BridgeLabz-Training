package com.day4_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records

 */
public class HospitalQueueBubbleSort {
	public static int[] bubbleSort(int [] arr) {
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		} 
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the patient's criticality level");
		int arr[]=new int [10];
		for(int i=0;i<10;i++) {
			 System.out.print("Criticality level of patient "+(i+1));
			 arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		System.out.println("The criticality in ascending order");
		System.out.println(Arrays.toString(arr));
	}
}
