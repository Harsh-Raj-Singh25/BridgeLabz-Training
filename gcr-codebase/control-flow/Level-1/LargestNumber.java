import java.util.*;
public class LargestNumber{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking input from user
        System.out.println("Enter your numbers");
		int number1=s.nextInt();
		int number2=s.nextInt();
		int number3=s.nextInt();
		
		// Printing the results
		System.out.println("Is the first number the largest? " + (number1>number2 && number1>number3)+
		"\n Is the second number the largest? "+  (number2>number1 && number2>number3) +
		" \n Is the third number the largest? "+(number3>number1 && number3>number2 ));
	}
}