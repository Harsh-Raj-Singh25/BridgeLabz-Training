package com.day7_Sorting.FitnessTrackerBubbleSort;

import java.util.List;

public class StepsBubbleSort {
	public static void sortDescending(List<PersonalRecord> users) {
		int n=users.size();
		
		for(int i=0;i<n;i++) {
			boolean swapped=false;
			
			for(int j=0;j<n-i-1;j++) {
				
				// comparing the steps count
				if(users.get(j).getSteps()< users.get(j+1).getSteps()) {
					// swapping if the adjacent element is greater
					PersonalRecord temp=users.get(j);
					users.set(j,users.get(j+1));
					users.set(j+1, temp);
					swapped=true;
				}
			}
			// breaking the loop if no swapping happens
			if(!swapped) {
				break;
			}
		}
	}
}
