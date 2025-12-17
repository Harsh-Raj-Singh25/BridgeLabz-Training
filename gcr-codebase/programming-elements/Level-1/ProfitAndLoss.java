public class ProfitAndLoss{
    public static void main(String [] args){
        
		double COST_PRICE=129;
		double SELLING_PRICE=191;
		//Calculate Profit
		double profit = SELLING_PRICE - COST_PRICE;
		// Calculate Profit percentage
		double profit_Percent = profit / COST_PRICE * 100;
		
		//Printing the results
		System.out.println("The Cost Price is INR " + COST_PRICE + " and Selling Price is INR " + SELLING_PRICE + "\n The Profit is INR "+ profit +" and the Profit Percentage is "+ profit_Percent);
	}
}