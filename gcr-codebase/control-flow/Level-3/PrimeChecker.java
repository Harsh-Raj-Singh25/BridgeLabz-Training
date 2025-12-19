import java.util.*;
public class PrimeChecker{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take number as input
        System.out.println("Enter your number");
		int number=s.nextInt();
		boolean isPrime=true;
		// check for prime
		for(int i=2;i<number;i++){
			if(number%i==0){
				isPrime=false;
				break;
			}
		}
		System.out.println("Prime Number :"+isPrime);
	}
}