import java.util.*;
public class AverageThreeNumbers{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
        double NUM1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double NUM2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double NUM3 = scanner.nextDouble();

        // Calculate the sum 
        double SUM = NUM1 + NUM2 + NUM3;

        // Calculate the average
        double AVERAGE = SUM / 3.0;

        System.out.printf("The average of the three numbers is: "+ AVERAGE);

        scanner.close();
    }
}