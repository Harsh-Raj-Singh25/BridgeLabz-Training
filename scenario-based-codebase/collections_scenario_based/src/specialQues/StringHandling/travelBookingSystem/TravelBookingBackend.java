package specialQues.StringHandling.travelBookingSystem;

public class TravelBookingBackend {
	public static void displayPackages() {
		System.out.println("Package Menu [Base prices] :");
		System.out.println("1. P123: ₹5000");
		System.out.println("2. P223: ₹10000");
		System.out.println("3. P345: ₹12000");
	}
	
	public static void displaySeasons() {
		System.out.println("Season Menu :");
		System.out.println("1. season ");
		System.out.println("2. peakseason ");
		System.out.println("3. offseason ");
	}
	public static double calculateBill(String[] details) {
		double totalBill=0;
		double basePrice=0;
		if(details[1].equalsIgnoreCase("p123")) {
			basePrice=5000;
		}else if(details[1].equalsIgnoreCase("p223")) {
			basePrice=10000;
		}else if(details[1].equalsIgnoreCase("p345")) {
			basePrice=12000;
		}else {
			basePrice=-1;
			System.err.println("Invalid package !!!");
			System.exit(0);
		}
		
		double discount=0;
		if(Integer.parseInt(details[2] ) >= 7 ){
			discount=0.1;
		}
		
		double additional=0;
		if(details[3].equalsIgnoreCase("season")) {
			additional=0.15;
		}else if(details[3].equalsIgnoreCase("peakseason")) {
			additional=0.25;
		}else if(details[3].equalsIgnoreCase("offseason")) {
			additional=0.10;
		}else {
			System.err.println("Invalid season !!!");
			System.exit(0);
		}
		
		totalBill=(basePrice - basePrice*discount)+ basePrice*additional;
		
		return totalBill;
	}
	
	public static void validator(String [] details) {
		if(!(details[1].equalsIgnoreCase("p123") || details[1].equalsIgnoreCase("p223") || details[1].equalsIgnoreCase("p345"))) {
			System.err.println("Invalid Package");
			System.exit(0);
		}else if(Integer.parseInt(details[2]) <= 0) {
			System.err.println("Number of days must be positive");
			System.exit(0);
		}else if(!(details[3].equalsIgnoreCase("season") || details[3].equalsIgnoreCase("peakseason") || details[3].equalsIgnoreCase("offseason"))) {
			System.err.println("Invalid season !!!");
			System.exit(0);
		}
	}
	
	public static void displayBill(String[] details) {
		System.out.println("*********************************************");
		System.out.println("***********Travel Booking System*************");
		System.out.println("*********************************************");
		System.out.println("Customer Name:              "+ details[0]+"  |");
		System.out.println("=============================================");
		System.out.printf(" %-10s |  %-10s |  %-15S |%n","PACKAGE ","SEASON","DAYS OF STAY");
		System.out.printf(" %-10s |  %-10s |  %-15d |%n",details[1],details[3],Integer.parseInt(details[2]));
		System.out.println("==============================================");
		System.out.println("                                 ");
		System.out.printf("Subtotal        :  %-10.2f%n",TravelBookingBackend.calculateBill(details));
		System.out.println("**********************************************");
	}
}
