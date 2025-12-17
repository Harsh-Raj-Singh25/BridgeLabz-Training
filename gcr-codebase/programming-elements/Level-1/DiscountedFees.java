import java.util.*;
public class DiscountedFees{
    public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the student fee: ");
		int fee=scanner.nextInt();
		System.out.println("Please enter the University discount percentage: ");
		int discount_percent=scanner.nextInt();
		// compute discount
		double discount=(double) fee* discount_percent /100;
		// computing the fees
		double feesToPay=(double) fee-discount;
		
		// Output
		System.out.println("The discount amount is INR " + discount+ " and final discounted fee is INR "+ feesToPay);
		
	}
}