/*10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/
import java.util.*;
public class RechargeSimulator{
	static double currentBalance=0.0;
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		boolean rechargeable=true;
		System.out.println("----Welcome to the RECHARGE PORTAL----");
		while(rechargeable){
			displayMenu();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			// using switch cases to display offers and also process the recharge
			// each case contains different cases from displayMenu method:
			switch(choice){
				case 1: 
					displayOffers("Jio");
					rechargeProcessor(sc);
					break;
				case 2:
					displayOffers("Airtel");
					rechargeProcessor(sc);
					break;
				case 3:
					displayOffers("VI");
					rechargeProcessor(sc);
					break;
				case 4:
					System.out.println(" The current balance is: "+ currentBalance);
					break;
				case 5:
					System.out.println("Thank you for using our service. Take Care !");
                    rechargeable = false;
                    break;
				default:
					System.out.println(" The input is invalid !!! \nPlease try again");
			}
		}
	
	
	}
	// method to display start menu:
	public static void displayMenu(){
		System.out.println(" ****Select any one****");
		System.out.println("1. Jio");
		System.out.println("2. Airtel");
		System.out.println("3. VI");
		System.out.println("4. Check balance");
		
		System.out.println(" *******************\n");
	}
	// offers display of single service providers:
	public static void displayOffers(String operator){
		System.out.println("\n The current offers for " + operator + " is:");
		System.out.println("Rs. 859 :	2GB/day	84 days	Unlimited calls, extended validity");
		System.out.println("Rs. 349 :	2GB/day	28 days	Unlimited calls, True 5G unlimited");
		System.out.println("Rs. 249 :	2GB/day	23 days	Unlimited calls, access to Jio apps");
	}
	// method to process recharge and calculate balance
	public static void rechargeProcessor(Scanner sc){
		System.out.println("Enter your amount");
		double amount=sc.nextDouble();
		
		// check for negative amount
		if(amount>0){
			currentBalance+=amount;
			System.out.println("RECHARGE SUCCESSFULL of amount : "+amount);
			System.out.printf("The updated balance : Rs. %.2f%n",currentBalance);
		}else{
			System.out.println("ERROR!!, invalid amount intered");
		}
		
	}
}