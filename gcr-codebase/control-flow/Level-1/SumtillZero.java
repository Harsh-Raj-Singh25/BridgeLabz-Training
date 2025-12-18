import java.util.*;
public class SumtillZero{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Initialize the variable total=0 and value =0
		double total=0.0;
		double value;
		
		// using while loop to keeping adding the user inputs to total till user enters a 0.
		while(true){
			System.out.println("Enter the value");
			value=s.nextDouble();
			total+=value;
			if(value==0){
				break;
			}
			
		}
		
		// Printing the total
		System.out.println(total);
	}
}
