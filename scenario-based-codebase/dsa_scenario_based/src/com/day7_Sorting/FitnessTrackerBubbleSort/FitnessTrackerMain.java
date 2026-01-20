package com.day7_Sorting.FitnessTrackerBubbleSort;

import java.util.ArrayList;
import java.util.List;

/*
 *  5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting
 */
public class FitnessTrackerMain {
	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("WELCOME TO FITNESS TRACKER");
		System.out.println("==========================");

		List<PersonalRecord> users = new ArrayList<>();

		users.add(new PersonalRecord("Harsh", 2415));
		users.add(new PersonalRecord("Namrata", 2000));
		users.add(new PersonalRecord("Anand", 3400));
		users.add(new PersonalRecord("Ajay", 5000));
		users.add(new PersonalRecord("Rahul", 2700));
		users.add(new PersonalRecord("Amrit", 1200));
		users.add(new PersonalRecord("Varun", 3200));
		users.add(new PersonalRecord("Ravi", 2400));
		users.add(new PersonalRecord("Raj", 4500));
		users.add(new PersonalRecord("Suman", 5600));
		users.add(new PersonalRecord("Satyam", 4300));
		users.add(new PersonalRecord("Shakti", 1750));

		System.out.println(" The daily leaderboard is :");
//		StepsBubbleSort.sortDescending(users);
//		
//		for(PersonalRecord pr:users) {
//			System.out.println(pr);
//		}
		StepsBubbleSort.sortDescending(users);

		System.out.println("\n          Daily Leaderboard  ");
		System.out.println("=====================================");
		System.out.println(" Ranking   |  Name             |  Steps    ");
		System.out.println("-------------------------------------");

		for (int rank = 0; rank < users.size(); rank++) {
			PersonalRecord user = users.get(rank  );
			System.out.printf("  %2d    | %s%n", rank+1, user);
		}

	}
}
