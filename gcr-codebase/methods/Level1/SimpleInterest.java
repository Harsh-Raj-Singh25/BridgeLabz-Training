import java.util.Scanner;

public class SimpleInterest {
	
	// Creating a method for calculating Simple Interest
	public double simpleInterest(Double principal, double rate, double time){
		double interest=(principal * rate * time )  / 100;
		return interest;
	}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input for principal, rate, time
		System.out.println("Enter your principal amount, rate of interest and time: ");
		double principal=sc.nextDouble();
		double rate =sc.nextDouble();
		double time=sc.nextDouble();
		
		// creating an object 
		SimpleInterest interestCalculate=new SimpleInterest();
		// calling the method and calculating the interest
		double interest=interestCalculate.simpleInterest(principal, rate, time);
		
		// Displaying the results
		System.out.println(" The interest is : "+ interest);
		
		sc.close();
	}
}
        