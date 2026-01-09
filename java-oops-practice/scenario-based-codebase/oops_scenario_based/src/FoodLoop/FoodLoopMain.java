package FoodLoop;

import java.util.Scanner;

public class FoodLoopMain {
	public static void main(String [] args) {
		FoodItem[] items= {
				new VegItem("Paneer Tikka",150,10),
				new NonVegItem("Chicken Tikka",250,5),
				new NonVegItem("Chicken Kolhapuri",300,15)
		};
		System.out.println("=======================");
		System.out.println("WELCOME TO FOODLOOP ORDERING");
		System.out.println("=======================");
		System.out.println("Available Food Options:");
		// display menu
		for(FoodItem i: items) {
			i.displayMenu();
		}
		
		Scanner sc=new Scanner(System.in);
		// initializing an order object i.e. new order request
		Order myOrder = new Order();
		boolean ordering=true;
		while(ordering) {
			System.out.println("CHOOSE YOUR FOOD :[1/2/3/ exit]");
			int choice =sc.nextInt();
			// checking if the choice is invalid or not
			if(choice>=1 && choice<=items.length) {
				myOrder.addItem(items[choice-1]);
			}else {
				System.out.println(" Order Complete---");
				ordering=false;
			}
		}
		
		// placing the order and billing
		myOrder.placeOrder();
		System.out.println("----------------------------");
		sc.close();
		
		
	}
	
}
