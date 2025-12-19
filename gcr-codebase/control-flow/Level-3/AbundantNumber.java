import java.util.*;
public class AbundantNumber{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take number as input
        System.out.println("Enter your number");
		int number=s.nextInt();
		// define sum variable
		int sum=0;
		//  run a for loop to fetch the divisors and add them to the sum variable
		for(int i=1; i<number; i++){
			if(number%i==0){
				sum+=i;
			}
		}
		
		// check for abundant condition i.e., sum of divisors should be greater than the number 
		// and display accordingly
		if( number<sum){
			System.out.println("the number is Abundant number");
		}else{
			System.out.println("the number is not Abundant");
		}
		
		s.close();
	}
}