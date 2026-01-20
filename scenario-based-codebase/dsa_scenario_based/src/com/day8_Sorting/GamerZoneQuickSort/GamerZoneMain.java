package com.day8_Sorting.GamerZoneQuickSort;
/*
 *  8. GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution
 */
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
