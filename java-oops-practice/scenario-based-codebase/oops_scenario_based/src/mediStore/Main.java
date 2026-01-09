package mediStore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tablet[] tablets = {
				new Tablet("Paracetamol", 45, "15-12-2026", 100),
				new Tablet("Action-500", 10, "15-06-2026", 50),
				new Tablet("P-500", 15, "15-07-2026", 25) 
			};

		Syrup[] syrups = { new Syrup("S-1", 10, "12-01-2027", 30), new Syrup("S-2", 15, "12-5-2026", 15),
				new Syrup("S-3", 20, "12-01-2026", 40) };

		Injection[] injections = { new Injection("I-1", 105, "26-10-2026", 45),
				new Injection("I-2", 150, "26-7-2026", 15), new Injection("I-3", 200, "26-08-2026", 30),

		};
		
		boolean running=true;
		while(running) {
			System.out.println("==========================");
			System.out.println("-Welcome to the MediStore-");
			System.out.println("==========================");

			System.out.println("SELECT THE MEDICINE YOU WANT TO BUY");
			System.out.println("CHOOSE FROM THE FOLLOWING:");
			System.out.println("1. Tablets");
			System.out.println("2. Syrups");
			System.out.println("3. Injections");
			
			int choice=sc.nextInt();
			if(choice==1) {
				for(int i=0;i<tablets.length;i++) {
					System.out.print((i+1)+".");
					tablets[i].displayDetails();
				}
				System.out.println("Choose the tablet");
				int c=sc.nextInt();
				System.out.println("Specify the number of units you wanna buy:");
				int number=sc.nextInt();
				// tablets.checkExpiry();
				tablets[c-1].sell(number);
			}
			else if(choice==2) {
				for(int i=0;i<syrups.length;i++) {
					System.out.print((i+1)+".");
					syrups[i].displayDetails();
				}
				System.out.println("Choose the Syrup");
				int c=sc.nextInt();
				System.out.println("Specify the number of units you wanna buy:");
				int number=sc.nextInt();
				// tablets.checkExpiry();
				syrups[c-1].sell(number);
			}else if (choice==3) {
				for(int i=0;i<syrups.length;i++) {
					System.out.print((i+1)+".");
					injections[i].displayDetails();
				}
				System.out.println("Choose the Injection");
				int c=sc.nextInt();
				System.out.println("Specify the number of units you wanna buy:");
				int number=sc.nextInt();
				// tablets.checkExpiry();
				injections[c-1].sell(number);
			}else {
				System.out.println("Invalid input");
				running=false;
				System.out.println("System is closing");
				System.out.println("Thank you for choosing us");
			}
		}
	}
}
