package specialQues.exceptionHandling.fitnessTracker;

import java.util.Scanner;

public class FitnessTrackerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("WELCOME TO THE FITNESS TRACKING APPLICATION");
			System.out.println(" ");
			FitnessTrackerBackend.displayActivities();
			System.out.println(" Enter you details in the format");
			System.out.println("activityName:durationInHours:intensityLevel");
			String str = sc.nextLine();
			String[] details = str.split(":");
			System.out.println(" Enter your weight in kilograms :");
			double weight = sc.nextDouble();
			sc.nextLine();
			FitnessTrackerBackend.validator(details, weight);
			System.out.println("Total Calories Burned : " + FitnessTrackerBackend.calculateCalories(details, weight));
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error: Please enter numeric values for weight, duration, and intensity.");
		} catch (Exception e) {
			System.out.println("Error: An unexpected error occurred.");
		} finally {
			// Requirement: Always display thank you
			System.out.println("Thank you for using the Fitness Tracker!");
			sc.close();
		}

	}
}
