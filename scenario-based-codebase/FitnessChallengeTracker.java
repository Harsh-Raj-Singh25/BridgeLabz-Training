/* 13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.*;
public class FitnessChallengeTracker{
	// setting days=7
	static int days=7;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		// initializing a array that'll store the pushups over 7 days:
		int [] pushUps=new int[days];
		System.out.println("----WELCOME TO THE FITNESS CHALLENGE TRACKER----");
		// take input from user:
		for(int i=0;i<days;i++){
			// check if its the rest day
			if(i==6){
				System.out.println("-----------------REST DAY-----------------");
				System.out.println("--------ALL THE BEST FOR NEXT WEEK--------");
				continue;
			}
			System.out.print("Enter the total completed push-ups for the day "+(i+1)+" : ");
			pushUps[i]=sc.nextInt();
		}
		// calling the method to calculate average push-ups and the total push-ups
		int [] array=averageAndTotal(pushUps);
		
		// Displaying the results:
		System.out.println();
		System.out.println("--- The Challenge stats for the week are:----");
		System.out.printf("Average push-ups : %-10s ||  Total push-ups : %-15s%n ",array[0],array[1]);
		
	}
	
	// METHOD TO CALCULATE AVERAGE AND TOTAL NUMBER OF PUSH-UPS FOR THE WEEK
	public static int[] averageAndTotal(int [] array){
		int average=0;
		int total=0;
		// using for-each loop to calculate total push-ups
		for(int i: array){
			total+=i;
		}
		average=total/days;
		return new int[]{average,total};
	}
	
}