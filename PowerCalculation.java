import java.util.*;
public class PowerCalculation{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
        double BASE_NUMBER = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double EXPONENT = scanner.nextDouble();

        // base^exponent = Math.pow(base, exponent) 
        double RESULT= Math.pow(BASE_NUMBER, EXPONENT);

        System.out.print("the result is: "+ RESULT);

        scanner.close();
    }
}