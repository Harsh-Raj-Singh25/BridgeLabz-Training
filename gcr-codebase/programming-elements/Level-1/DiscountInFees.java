public class DiscountInFees{
    public static void main(String [] args){
		
		int fee=125000;
		int DISCOUNT_PERCENT=10;
		// compute discount
		double discount=(double) 125000*10/100;
		// computing the fees
		double feesToPay=(double) fee-discount;
		
		// Output
		System.out.println("The discount amount is INR " + discount+ " and final discounted fee is INR "+ feesToPay);
		
	}
}
