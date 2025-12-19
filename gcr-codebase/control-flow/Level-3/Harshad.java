import java.util.*;
public class Harshad{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take number as input
        System.out.println("Enter your number");
		int number=s.nextInt();
		// define sum variable
		int sum=0;
		// make a copy of input number
		int originalNumber=number;
		// while loop till originalNumber is not zero
		while(number>0){
			// fetch last digit
			int ld=number % 10;
			//add the last digit to the sum
			sum+=ld;
			// trim the number from end
			number /= 10;
		}
		
		// check for Harshad condition i.e., number divisible by sum of its digits and display accordingly
		if( originalNumber % sum == 0){
			System.out.println("the number is Harshad number");
		}else{
			System.out.println("the number is not Harshad");
		}
	}
}