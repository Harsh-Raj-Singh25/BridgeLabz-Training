import java.util.Scanner;

public class RoundCalculator {
	// defining the distance that athlete wants to run
	static double distance=5.0;
	
	// Creating a method for calculating number of rounds
	public double totalRounds(Double side1, double side2, double side3 ){
		double perimeter=side1+ side2 + side3;
		double rounds=(distance*1000) / perimeter;
		return rounds;
	}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input for principal, rate, time
		System.out.println("Enter the sides of the triangular park in meters");
		double side1=sc.nextDouble();
		double side2 =sc.nextDouble();
		double side3=sc.nextDouble();
		
		// creating an object
		RoundCalculator run=new RoundCalculator();
		// calling the method and storing the result in a variable round
		double rounds=run.totalRounds(side1,side2,side3);
		
		// displaying the output
		System.out.println("The number of rounds user needs to do to complete 5km run: "+ rounds);
		
		sc.close();
	}
}
		