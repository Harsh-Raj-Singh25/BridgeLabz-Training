import java.util.*;
public class Divisibility{
	public static void main(String [] args){
	    // Create a Scanner Object
		Scanner s=new Scanner(System.in);
		
		// Get input from user
        System.out.println("Enter your number");
		int number=s.nextInt();
		
		// check divisibilty by 5 and print the result
		System.out.println("Is the number "+ number+ " divisible by 5?"+ (number % 5==0));
	}
}