import java.util.*;
public class Armstrong{
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
			// calculate cube of number
			int cube= ld*ld*ld;
			//add the cube to the sum
			sum+=cube;
			// trim the number from end
			number /= 10;
		}
		
		// check for armstrong condition and display accordingly
		if( originalNumber==sum){
			System.out.println("the number is Armstrong number");
		}else{
			System.out.println("the number is not Armstrong");
		}
	}
}
		