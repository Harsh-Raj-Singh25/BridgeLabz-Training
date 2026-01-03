package CabbyGo;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Driver d1 = new Driver("RajKumar", "MP04UB5578", 3.9);

		System.out.println("****Welcome to CabbyGo Ride Service*****");
		System.out.println("****Prop. Harsh Raj Singh*****");
		System.out.println("The available driver is :" + d1.name + " and his rating is :" + d1.getRating());

		System.out.println("The ride options are:-");
		System.out.println("1.Mini [Budget friendly]");
		System.out.println("2.SUV [Big & Luxurious");
		System.out.println("Enter yuur choice : ");

		int choice = sc.nextInt();
		System.out.println("enter the distance");
		double distance = sc.nextDouble();
		// POLYMORPHISM: Reference of parent type but object of child type
		Vehicle v1;
		if (choice == 1) {
			v1 = new Mini("MP04UB8737");
		} else {
			v1 = new Suv("Mp059477427");
		}

		System.out.println("The ride is started.\n--Happy Journey--");
		// INTERFACE: Using interface method via casting or direct object access
		if (v1 instanceof IRideService) {
			((IRideService) v1).bookRide(distance);
		}
		
		double totalFare=0;
		if (v1 instanceof Mini) {
			totalFare= ((Mini) v1).calculateFare(distance);
		} else if (v1 instanceof Suv ) {
			totalFare = ((Suv) v1).calculateFare(distance);
		}
		System.out.println("Arrived at  the destination...");
		((IRideService) v1).endRide();

		System.out.println("----------------------------------------------");
		System.out.printf("FINAL PAYABLE Amount: "+ totalFare);

		sc.close();

	}
}
