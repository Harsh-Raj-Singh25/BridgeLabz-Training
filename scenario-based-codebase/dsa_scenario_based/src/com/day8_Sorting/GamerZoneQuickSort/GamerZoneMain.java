package com.day8_Sorting.GamerZoneQuickSort;

public class GamerZoneMain {
	public static void main(String[] args) {
		Player [] array= {
				new Player("Harsh",255),
				new Player("Ajay",125),
				new Player("Varun",245),
				new Player("Suman",150)
		};
		
		System.out.println("===========================");
		System.out.println("  WELCOME TO  GAMERZONE  ");
		System.out.println("===========================");
		System.out.println("The list of top scoreers:-");
		PlayerQuickSort.quickSort(array, 0, array.length-1);
		for(Player p: array) {
			p.display();
		}
	}
}
