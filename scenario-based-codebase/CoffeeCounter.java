/* Problem 1: The Coffee Counter Chronicles
Ravi runs a café where customers order different types of coffee with specific quantities.
Write a Java program that asks the user for the coffee type using switch, accepts quantity, 
calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, 
and continues serving customers using a while loop. The program should stop when the user types “exit”.*/

import java.util.Scanner; 
public class CoffeeCounter {

    static final double GST_RATE = 0.05; 

    // Returns coffee price based on coffee type
    public static double getCoffeePrice(String coffeeType) {
        switch (coffeeType) {
            case "espresso":
                return 119;
            case "americano":
                return 149;
            case "cappuccino":
                return 169;
            default:
                return -1; // Invalid coffee type
        }
    }

    // Calculates total bill including GST
    public static double calculateTotalBill(double price, int quantity) {
        double baseAmount = price * quantity;
        double gst = baseAmount * GST_RATE;
        return baseAmount + gst;
    }
	public static void printReceipt(String coffeeType, int quantity, double price, double totalBill) {
		double baseAmount = price * quantity;
		double gstAmount = totalBill - baseAmount;
		
		System.out.println("       COFFEE COUNTER CHRONICLES         ");
		System.out.println("==========================================");
    
		// Header for items
		System.out.printf("%-20s %-10s %-10s%n", "Item", "Qty", "Amount");
		System.out.println("------------------------------------------");
    
		// Itemized row
		// %-20s -> Coffee Name (Left aligned, 20 spaces)
		// %-10d -> Quantity (Left aligned, 10 spaces)
		// %-10.2f -> Price (Left aligned, 10 spaces, 2 decimals)
		System.out.printf("%-20s %-10d %-10.2f%n", coffeeType, quantity, baseAmount);
    
		System.out.println("------------------------------------------");
    
		// Summary section
		System.out.printf("%-30s Rs. %7.2f%n", "Subtotal:", baseAmount);
		System.out.printf("%-30s Rs. %7.2f%n", "GST (5%):", gstAmount);
    
		System.out.println("==========================================");
		System.out.printf("%-30s Rs. %7.2f%n", "TOTAL BILL:", totalBill);
		System.out.println("==========================================");
		System.out.println("      Thank you! Brew-tiful day!         ");
		System.out.println("==========================================\n");
	}

    // Program execution starts here
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Loop to take multiple orders
        while (true) {
            System.out.println("\nWelcome to Coffee Counter Chronicles!");
            //System.out.println("Available coffee types: espresso (Rs.120), americano (Rs.150), cappuccino (Rs.180) \n Type 'exit' to quit.");
			System.out.printf("%-15s %-15s %-15s%n", "1. Espresso", "2. Americano", "3. Cappuccino");
            System.out.printf("%-15s %-15s %-15s%n", "Rs. 120", "Rs. 150", "Rs. 180");
            System.out.println("Type 'exit' to quit.");
            String coffeeType = scanner.next().toLowerCase();

            if (coffeeType.equals("exit")) break; // Stops the program

            double price = getCoffeePrice(coffeeType);

            if (price == -1) {
                System.out.println("Invalid coffee type!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double totalBill = calculateTotalBill(price, quantity);

            
			printReceipt(coffeeType,  quantity,  price, totalBill);
        }

        System.out.println("Thank you for ordering, please visit again!");
        scanner.close(); //Closing the Scanner Object
    }
}