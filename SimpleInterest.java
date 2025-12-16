import java.util.*;
public class SimpleInterest{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Principal amount (P): ");
        double PRINCIPAL = scanner.nextDouble();

        // R: Annual interest rate (percentage)
        System.out.print("Enter Rate of interest per annum (R): ");
        double RATE = scanner.nextDouble();

        // T: Time in years
        System.out.print("Enter Time in years (T): ");
        double TIME = scanner.nextDouble();

        // Formula: SI = (P * R * T) / 100
        double SIMPLE_INTEREST = (PRINCIPAL * RATE * TIME) / 100;

        System.out.printf("The Simple Interest is: " + SIMPLE_INTEREST);

        scanner.close();
    }
}