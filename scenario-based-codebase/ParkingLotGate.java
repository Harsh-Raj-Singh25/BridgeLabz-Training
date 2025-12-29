/* 6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
//System.out.printf("%-10d %-15.2f %-10.2f %-15.2f%n", (i + 1), oldSalary, bonus, newSalary);
*/
import java.util.*;
public class ParkingLotGate{
	// Menu method:
	static int totalSlots=10;
	static int occupiedSlots=0;
	
	public static void displayMenu(){
		System.out.println("\n ******************************");
		System.out.println("1. Park the vehicle");
		System.out.println("2. Exit the parking");
		System.out.println("3. Show Occupancy");
		System.out.println(" ******************************");
	}
	// method for parking
	public static void parkVehicle(){
		if(occupiedSlots<totalSlots){
			occupiedSlots++;
			System.out.println("!!SUCCESS!! \n The vehicle is successfully parked at "+ occupiedSlots + " number slot");
		}else{
			System.out.println("-----Sorry!!!!----- \n The slots are already occupied");
		}
	}
	public static void exitParking(){
		if(occupiedSlots>0){
			occupiedSlots--;
			System.out.println("!!SUCCESS!! \n The vehicle has successfully exited from "+ occupiedSlots + " number slot");
		}else{
			System.out.println("!!ERROR!! \n The slots are already empty");
		}
	}
	
	public static void showOccupancy(){
		System.out.println(" The current occupancy is :");
		System.out.printf("  Occupied:  %-15s Available: %-15s%n",occupiedSlots,(totalSlots-occupiedSlots));
	}
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		boolean parkable=true;
		
		while(parkable){
			System.out.println("--Welcome to the HarshRaj underground Car Parking--");
			displayMenu();
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					parkVehicle();
					break;
				case 2: 
					exitParking();
					break;
				case 3: 
					showOccupancy();
					break;
				case 4:
					System.out.println(" Shutting down system--- Good Bye!!!");
					parkable=false;
					break;
				default:
					System.out.println(" Invalid option !!!! Try again");
			}
			
			if(occupiedSlots== totalSlots){
				System.out.println(" ------The parking is already full------");
				parkable=false;
			}
		}
		sc.close();
	}
}
			
		
		
