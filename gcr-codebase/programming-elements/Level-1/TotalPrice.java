import java.util.*;
public class TotalPrice{
    public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter the unit price of the item");
		int unitPrice=sc.nextInt();
		System.out.println(" enter the quantity to be bought");
		int quantity = sc.nextInt();
		// calculate the total price
		int total_price=unitPrice * quantity;
		
		// Required output
		System.out.println("The total purchase price is INR " + total_price+ " if the quantity is "+ quantity + " and unit price is INR"+ unitPrice);
	}
}
		