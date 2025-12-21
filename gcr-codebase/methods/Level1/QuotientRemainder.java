import java.util.Scanner;

public class QuotientRemainder {
	// Creating a method
	public static int[] findRemainderAndQuotient(int number, int divisor){ 
		// initialize the largest and the smallest
		int quotient=number/divisor;
		int remainder=number % divisor;
		// return the values in form of an array
		return new int[] {quotient,remainder};
		
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your number and divisor ");
		int number=sc.nextInt();
		int divisor=sc.nextInt();
		
		// call the method and store results in array
		int [] array=findRemainderAndQuotient(number, divisor);
		
		// displaying the results using 
		System.out.println("The quotient  is :"+ array[0] + "\n The remainder is : "+ array[1]);
	}
}