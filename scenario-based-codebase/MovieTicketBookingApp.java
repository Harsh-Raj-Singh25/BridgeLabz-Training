/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names. */
import java.util.*;
public class MovieTicketBookingApp{
	static int totalSeats=120;
	static int bookedSlotSeats[]={0,0,0,0,0};
	// int occupiedSeats=0;
	// method to display movie menu:
	public static void displayMovieMenu(){
		System.out.println("*****Select any one type and time*****");
		System.out.println("1. Romantic [9 p.m to 12 p.m] ");
		System.out.println("2. Comedy [3 p.m. to 6 p.m]");
		System.out.println("3. Action [ 12 p.m to 3 p.m] ");
		System.out.println("4. Horror [ 6 p.m to 9 p.m]");
		System.out.println("5. Thriller [9 a.m to 12 p.m]");
		System.out.println("6. Exit");
		System.out.println("************************************\n");
	}
	// Method to display seat options:
	public static void displaySeatOptions(){
		System.out.println(" ******Select any one seat type******");
		System.out.println("1. Gold [Rs.125]");
		System.out.println("2. Silver [Rs.100] ");
		System.out.println("3. Platinum [Rs.150]");
		System.out.println("4. Premium Platinum [Rs.200]");
		System.out.println("5. VIP Recliner Seats [Rs.350]");
		System.out.println("************************************\n");
	}
	// method to display snacks options:
	public static void displaySnacks(){
		System.out.println(" ************Select any one***********");
		System.out.println("1. Mini Pop-Corn [Rs.100]");
		System.out.println("2. Pop-Corn medium [Rs.150]");
		System.out.println("3. Pop-Corn large [Rs.200]");
		System.out.println("4. SoftDrink[Rs.50]");
		System.out.println("5. Samosa [Rs.25]");
		System.out.println("6. No snacks");
		System.out.println("************************************\n");
	}
	public static boolean isAvailable(int number, int bookedSlotSeats){
		return (totalSeats-bookedSlotSeats)>=number; 
	}
	// method to calculate price of tickets
	public static int getSeatCost(int seatChoice, int number){
		switch(seatChoice){
			case 1:
				return 125*number;
			case 2:
				return 100*number;
			case 3:
				return 150*number;
			case 4:
				return 200*number;
			case 5:
				return 350*number;
			default:
				return 0;
		}
	}
	// method to calculate snacks cost
	public static int getSnackCost(int snackChoice, int snackQty){
		switch(snackChoice){
			case 1:
				return 100* snackQty;
			case 2:
				return 150* snackQty;
			case 3:
				return 200 * snackQty;
			case 4:
				return 50 * snackQty;
			case 5:
				return 25 * snackQty;
			default:
				return 0;
		}
	}			
	// method to show seat availability
	/*public static void showAvailability(){
		System.out.println("The current Availability is :");
		System.out.printf("Booked:%-5s || Available:%-5s%n",occupiedSeats,(totalSeats-occupiedSeats));
	}*/
	
	// display method
	public static void displayBill(int seats,int seatChoice,int totalSeatCost, int snackChoice, int snackQty, int totalSnackCost){
		int totalBill = totalSeatCost + totalSnackCost;
		System.out.println("---------CONGRATULATIONS YOUR SEATS AND SNACKS ARE BOOKED-----------");
		System.out.println("==============================================");
		System.out.println("------------HRS CINEMA & THEATRES-------------");
		System.out.println("          Booking Date: 31-Dec-2025           ");
		System.out.println("==============================================");
		// using string formating to show items in tabulated form :
		System.out.printf("%-25s %-5s %12s%n", "ITEM DESCRIPTION", "QTY", "PRICE (Rs)");
		System.out.println("----------------------------------------------");
		System.out.printf("%-25s %-5d %12d%n", "Movie Tickets (Type " + seatChoice + ")", seats, totalSeatCost);
		System.out.printf("%-25s %-5d %12d%n", "Snacks (Choice " + snackChoice + ")", snackQty, totalSnackCost);
		System.out.printf("%-31s: Rs. %8.2f%n", "GST (18%)", totalBill*0.18);
		System.out.println("==============================================");
		System.out.printf("%-31s: Rs. %8.2f%n", "GRAND TOTAL", (totalBill + totalBill*0.18));
		System.out.println("==============================================");
		System.out.println("         !!!!ENJOY YOUR MOVIE!!!!             ");
		
		
		//System.out.printf("%-10s %-12s %-15s %-15s %-15s %-15s %-10s%n","seats","seatChoice","totalSeatCost"," snackChoice", "snackQty"," totalSnackCost","totalBill");
		//System.out.printf("%-10d %-12d %-15d %-15d %-15d %-15d %-10d%n",seats,seatChoice,totalSeatCost, snackChoice, snackQty, totalSnackCost,totalBill);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("----WELCOME TO THE HRS CINEMA AND THEATRE----");
		boolean booking=true;
		// using while loop to loop over multiple users
		while(booking){
			// display movie slots
			displayMovieMenu();
			System.out.println("----Select your Movie Preference----");
			int movieChoice=sc.nextInt();
			// exit case
			if (movieChoice == 6) {
                System.out.println("Shutting down... Goodbye!");
                booking = false;
                break;
            }
			// invalid case 
            if (movieChoice < 1 || movieChoice > 5) {
                System.out.println("Invalid option! Try again.");
                continue;
            }

            // Logic for all movies
            int slotIndex = movieChoice - 1;
            
            System.out.print("Number of seats to book: ");
            int seatsToBook = sc.nextInt();
			// checking if seats are available or not and then proceeding ahead
            if (isAvailable(seatsToBook, bookedSlotSeats[slotIndex])) {
                displaySeatOptions();
                int seatType = sc.nextInt();
                int totalSeatCost = getSeatCost(seatType, seatsToBook);
				// display the snacks menu
                displaySnacks();
                int snackChoice = sc.nextInt();
                int snackQty = 0;
				// checking the invalid cases
                if (snackChoice != 0 && snackChoice<6) {
                    System.out.print("Quantity of snacks: ");
                    snackQty = sc.nextInt();
                }
                int totalSnackCost = getSnackCost(snackChoice, snackQty);

                // Update static tracking
                bookedSlotSeats[slotIndex] += seatsToBook;
                
                displayBill(seatsToBook,seatType,totalSeatCost,snackChoice,snackQty, totalSnackCost);
				System.out.println();
            } else {
                System.out.println("!!! ERROR: Only " + (totalSeats - bookedSlotSeats[slotIndex]) + " seats left for this slot.");
            }
        }
        sc.close();
	}
}