package com.day8_Sorting.FoodFestMergeSort;
/*
 *  7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values
 */
import java.util.Scanner;

public class FoodFestMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("WELCOME TO THE BHOPAL FOOD-FEST");
		System.out.println("===============================");
		
		System.out.print(" Enter the number of Stalls");
		int number=sc.nextInt();
		sc.nextLine();
		
		Stall [] stalls=new Stall[number];
		
		for(int i=0;i<number;i++) {
			System.out.println(" Enter the name of stall");
			String name=sc.next();
			System.out.println(" Enter the total number of customers visited");
			int footfall=sc.nextInt();
			stalls[i]=new Stall(name,footfall);
		}
		
		// using the sort method to sort and merge the list
		FootFallMergeSort.mergeSort(stalls, 0, number-1);;
		
		for(Stall st: stalls ) {
//			System.out.println(s);
			st.display();
		}
		
		
	}
}
