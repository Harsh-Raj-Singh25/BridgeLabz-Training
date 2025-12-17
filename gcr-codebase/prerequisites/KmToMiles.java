import java.util.*;
public class KmToMiles{
    public static void main(String [] args){
	    Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter distance in Kilometers (km): ");
        double KILOMETERS = scanner.nextDouble();

        // Formula: Miles = Kilometers * 0.621371
        double MILES = KILOMETERS* 0.621371;

        System.out.println("resultant miles is: "+ MILES);

        scanner.close();
    }
}