package Artify;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Artwork art[]= {
				new DigitalArt("The Starry Night","Vincent-Van",5500,"Purchase"),
				new DigitalArt("The Indrapuri Horror","Devika",50000,"Purchase"),
				new PrintArt("The Indian Circus","Harshh",50000,"Purchase",1000),
				new PrintArt("Monalisa","Leonardo",550000,"Purchase",2000)
				
		};
		
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your walletBalance");
		double balance=sc.nextDouble();
		User u1=new User(name,balance);
		u1.setWalletBalance(balance);
		boolean purchasing=true;
		
		while(purchasing) {
			double prices[]=new double[art.length];
			System.out.println("Here are all the artifacts");
			for(int i=0;i<art.length;i++) {
				System.out.print((i+1)+".");
				art[i].display();
				prices[i]=art[i].getPrice();
			}
			System.out.println(Arrays.toString(prices));
			System.out.println("Choose your painting");
			int choice=sc.nextInt();
			if(choice>=1 && choice <5) {
				u1.purchase(prices[choice-1]);
			}else {
				System.out.println("!!!!!!!  INVALID CHOICE   !!!!!!");
				purchasing=false;
			}
		}
		
		
		
		
	}
}
