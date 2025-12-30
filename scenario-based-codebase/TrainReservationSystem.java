/* 12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/	
import java.util.*;
public class TrainReservationSystem{
	// Menu method:
	static int totalSeats=500;
	static int occupiedSeats=0;
	
	public static void displayMenu(){
		System.out.println("||*****************************||");
		System.out.println("1. Book Ticket");
		System.out.println("2. Cancel Booking");
		System.out.println("3. Show Ticket availability");
		System.out.println("4. to Exit and close the system");
		System.out.println("||*****************************|| \n");
	}
	// method for Booking
	public static void bookTicket(){
		if(occupiedSeats<totalSeats){
			occupiedSeats++;
			System.out.println("!!SUCCESS!! \n Your ticket is successfully booked and your seat number is : "+ occupiedSeats );
		}else{
			System.out.println("-----Sorry!!!!----- \n The seats are already booked");
		}
	}
	// method to cancelTicket
	public static void cancelTicket(){
		if(occupiedSeats>0){
			System.out.println("!!SUCCESS!! \n The ticekt is cancelled ");
			System.out.println("**Cancellation Status : Berth NO. "+occupiedSeats +" Cancelled**");
			occupiedSeats--;
		}else{
			System.out.println("!!ERROR!! \n The seats are already vacant");
		}
	}
	// method to show seat availability
	public static void showAvailability(){
		System.out.println("The current Availability is :");
		System.out.printf("Booked:%-5s || Available:%-5s%n",occupiedSeats,(totalSeats-occupiedSeats));
	}
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		boolean booking=true;
		// running a while loop to display the system until user wants to exit
		while(booking){
			System.out.println();
			System.out.println("--Welcome to the Modern Railway Ticketing System--");
			displayMenu();
			System.out.print("Enter your choice : ");
			int choice=sc.nextInt();
			// switch case to check the choices and implement methods.
			switch(choice){
				case 1:
					bookTicket();
					break;
				case 2: 
					cancelTicket();
					break;
				case 3: 
					showAvailability();
					break;
				case 4:
					System.out.println(" Shutting down system--- Good Bye!!!");
					booking=false;
					break;
				default:
					System.out.println(" Invalid option !!!! Try again");
			}
			
			if(occupiedSeats== totalSeats){
				System.out.println(" ------The tickets are already booked------");
				booking=false;
			}
			System.out.println();
		}
		sc.close();
	}
}