/* 8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/
import java.util.*;
public class DiscountDashboard{
	public static double finalbill(double totalbill,double discountPercent){
		double discount=totalbill*discountPercent/100;
		return totalbill-discount;
	}
	public static void displayBill(double number, double totalbill, double discountPercent, double finalBill){
		System.out.println("                              HARSH GARMENTS                   ");
		System.out.println("====================================================================");
		System.out.printf("%-10s %-10s %-12s %-10s %-20s%n", "Item", "Qty", "Total-Amount","discount","Final-Total-Bill");
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-10s %-10f %-12f %-10f %-20f%n", "Clothes", number, totalbill,discountPercent, finalBill);
		System.out.println("======================================================================");
		System.out.println("==================Thank you for shopping with us======================");
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--- Welcome to Harsh Garments ---");
		System.out.println(" Enter the total number of clothes purchased");
		double number=sc.nextDouble();
		int totalbill=0;
		
		for(int i=0;i<number;i++){
			System.out.println("Enter the price of clothe number: "+(i+1));
			double price=sc.nextDouble();
			totalbill+=price;
		}
		double discountPercent=0;
		double finalBill=0;
		//if-else for discount logic:
		if(totalbill>=10000){
			discountPercent=25;
			finalBill=finalbill(totalbill,discountPercent);
			displayBill(number,totalbill, discountPercent, finalBill);
		}else if(totalbill<10000 && totalbill>=5000){
			discountPercent=15;
			finalBill=finalbill(totalbill,discountPercent);
			displayBill(number, totalbill, discountPercent, finalBill);
		}else if(totalbill>2000 && totalbill<=5000){
			discountPercent=10;
			finalBill=finalbill(totalbill,discountPercent);
			displayBill(number, totalbill, discountPercent, finalBill);
		}else if(totalbill>500 && totalbill<=2000){
			discountPercent=5;
			finalBill=finalbill(totalbill,discountPercent);
			displayBill(number, totalbill, discountPercent, finalBill);
		}else{
			discountPercent=0;
			finalBill=totalbill;
			displayBill(number, totalbill,discountPercent, finalBill);
		}
	}
}
			
		