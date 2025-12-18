import java.util.*;
public class FactorialW{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking input from the user
        System.out.println("Enter your number");
		int number=s.nextInt();
		// initialize the factorial as fact=1;
		int fact=1;
		// calculating the factorial using while loop
		while(number>0){
			fact*=number;
			number--;
		}
		System.out.println("The factorial is : "+ fact);
			
		
		
	}
}