package com.Sorting.InsertionSort;
/*
2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/
public class SortEmployeeIDs {
	public static void main(String[] args) {
		int [] employeeIds= {12,45,20,17,12,20,8};
		InsertionSorter IS=new InsertionSorter();
		IS.insertionSort(employeeIds);
		System.out.println("Sorted Ids:");
		System.out.print("[");
		for(int i:employeeIds) {
			System.out.print(i);
			System.out.print("  ");
		}
		System.out.println(" ]");
	}
	
}

