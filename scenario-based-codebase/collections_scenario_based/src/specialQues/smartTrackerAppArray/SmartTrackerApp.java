package specialQues.smartTrackerAppArray;

import java.util.Arrays;
import java.util.Scanner;

public class SmartTrackerApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [] temp=new int[7];
		int [] sales=new int[7];
		System.out.println("********************************");
		System.out.println("WELCOME TO THE SMART TRACKER APP");
		System.out.println("********************************");
		for(int i=0;i<7;i++) {
			System.out.println("Enter the temperature of day :"+ (i+1));
			temp[i]=input.nextInt();
			System.out.println("Enter the sales of day: "+ (i+1) );
			sales[i]=input.nextInt();
		}
		System.out.println(" The summary of data:");
		
		System.out.println("Average Temperature :"+ArrayMethods.averageArray(temp)+ " °C");
		System.out.println("Highest Temperature :"+ ArrayMethods.highestArray(temp)+ " °C");
		System.out.println("Lowest Temperature :"+ ArrayMethods.lowestArray(temp)+ " °C");
		System.out.println("Number of Hot days(>30°C): "+ArrayMethods.countSpecificDays(temp, 30) + " °C");
		System.out.println("****************************************");
		System.out.println("Sales Data :");
		System.out.println("Total Sales : "+ ArrayMethods.sumArray(sales) );
		System.out.println("Average Sales : "+ArrayMethods.averageArray(sales));
		System.out.println("Highest Sale : "+ ArrayMethods.highestArray(sales)+ " on Day "+ArrayMethods.highestIndex(sales));
		System.out.println("Lowest Sale : "+ArrayMethods.lowestArray(sales)+ " on Day "+ArrayMethods.lowestIndex(sales));
		System.out.println("Number of high sales days (>100): "+ArrayMethods.countSpecificDays(sales, 100));
		System.out.println("Sale 150 found on day "+ ArrayMethods.findSpecific(sales, 150));
		System.out.println("Updated sales for Day 2: 95 ");
		int [] updatedSales=ArrayMethods.updateRecords(sales, 2, 95);
		System.out.println("Updated sales record "+ Arrays.toString(updatedSales));
	}
	
	
	
	
}
