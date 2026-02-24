package specialQues.StringHandling.travelBookingSystem;

import java.util.Arrays;
import java.util.Scanner;

public class TravelBookingApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO THE TRAVEL BOOKING SYSTEM");
		
		
		
		boolean booking=true;
		while(booking) {
			TravelBookingBackend.displayPackages();
			TravelBookingBackend.displaySeasons();
			System.out.println("");
			System.out.println("Enter booking details in format : ");
			System.out.println("customerName:packageName:numberOfDays:season");
			String str=sc.nextLine();
			str.toLowerCase();
			String[] details=str.split(":");
			System.out.println(Arrays.toString(details));
			TravelBookingBackend.validator(details);
			double totalAmount=TravelBookingBackend.calculateBill(details);
			TravelBookingBackend.displayBill(details);
		}
		
		
		
	}
}
