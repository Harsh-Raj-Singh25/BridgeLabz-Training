import java.util.*;
public class PrimeChecker{
	// method to check prime
	public static boolean checkPrime(int number){	
		// check for prime
		for(int i=2;i<number;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println(" tell your number");
		int number=sc.nextInt();
		// use method and display the result
		if(checkPrime(number)){
			System.out.println(" the number is prime");
		}else{
			System.out.println(" the number is not prime");
		}
	}
}