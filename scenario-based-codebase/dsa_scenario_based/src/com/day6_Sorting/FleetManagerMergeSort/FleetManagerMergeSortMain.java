package com.day6_Sorting.FleetManagerMergeSort;

/*
 *  10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
 */
public class FleetManagerMergeSortMain {
	public static void main(String[] args) {
		Vehicle [] array= {
				new Vehicle("Maruti",32),
				new Vehicle("Mercedes",15),
				new Vehicle("Hyundai",19),
				new Vehicle("Mahindra",20),
				new Vehicle("Tata",25)
		};
		VehicleMergeSort.mergeSort(array);
		
		for(Vehicle v: array) {
			v.display();
		}
	}
}
