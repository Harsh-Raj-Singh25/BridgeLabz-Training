import java.util.*;
public class CountDigits{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take number as input
        System.out.println("Enter your number");
		int number=s.nextInt();
		// define count variable
		int count=0;
		// make a copy of input number
		int originalNumber=number;
		// while loop till originalNumber is not zero
		while(number>0){
			// fetch last digit
			int ld=number % 10;
			// increase the count counter of number
			count++;
			// trim the number
			number/=10;
		}
		
		// Display the count of digits
		System.out.println("there are "+ count + " digits in the number "+originalNumber);
			
		s.close();
	}
}