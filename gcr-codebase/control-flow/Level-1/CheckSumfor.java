import java.util.*;
public class CheckSumfor{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking input from the user
        System.out.println("Enter your number");
		int number=s.nextInt();
		int numberCopy=number;
		
		//Check whether the number is natural or not. If yes compute the sum of n natural numbers using formula and while loop.
		if(number>=0){
		    int sumForm=number * (number + 1) / 2;
			int sum=0;
			for(int i= number;i>0;i--){
				sum+=i;
			}
			System.out.println("The sum of "+ numberCopy +" natural numbers is "+ sum + " and it's "+ (sumForm==sum) + " by both formula and the loop" );
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
		
		
	}
}