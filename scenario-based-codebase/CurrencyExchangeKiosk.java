/* 18. Currency Exchange Kiosk 💱Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/
import java.util.*;
public class CurrencyExchangeKiosk{
	
	public static void displaymenu(){
		System.out.println("-----CHOOSE THE TARGET CURRENCY-----");
		System.out.println("1.DOLLAR $");
		System.out.println("2.EURO ");
		System.out.println("3. POUND");
		System.out.println("4. Saudi Riyal");
		System.out.println("5.YEN");
		System.out.println("6. EXIT FROM THE SYSTEM");
	}	
		
	public static  void exchanger(double amount,int choice){
		double targetAmount=0;
		switch(choice){
			case 1:
				targetAmount= amount/89.9 ;
				break;
			case 2:
				targetAmount= amount/ 105.54 ;
				break;
			case 3:
				targetAmount= amount / 121.04 ;
				break;
			case 4:
				targetAmount= amount / 23.98 ;
				break;
			case 5:
				targetAmount= amount * (100/66.28)  ;
				break;
			case 6:
				System.err.println(" Thank you for using the converter");
				System.exit(0);
			default:
				System.err.println(" Thank you for using the converter");
				break;
				
		}
		System.out.println("The approximate amount will be :"+ targetAmount);
		
	}	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("-----WELCOME TO CURRENCY CONVERTER-----");
		System.out.print("Enter the amount in Rupees: " );
		double amount=sc.nextDouble();
		displaymenu();
		System.out.print("Enter your target currency index : ");
		int choice=sc.nextInt();
		if(choice>6 || choice<1){
			System.err.println("-----INVALID CHOICE-----\n-----System is closing-----");
		}else{
			exchanger(amount,choice);
		}
	}
}