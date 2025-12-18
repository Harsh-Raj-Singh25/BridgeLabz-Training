import java.util.*;
public class quotientRemainder{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter your numbers");
		int number1=s.nextInt();
		int number2=s.nextInt();
		// operations
		int quotient=number1/number2;
		int remainder=number1 % number2;
		
		// output
		System.out.println("The Quotient is "+ quotient+" and Reminder is "+ remainder+" of two numbers"+ number1+" and "+ number2);
	}
}
