import java.util.*;
public class SumWhile{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Initialize the variable total=0 and take value from user 
		double total=0.0;
		double value = s.nextDouble();
		
		// using while loop to keeping adding the user inputs to total till user enters a 0.
		while(value!=0){
			total+=value;
			System.out.println("Enter the value");
			value=s.nextDouble();
			
		}
		
		// Printing the total
		System.out.println(total);
	}
}
