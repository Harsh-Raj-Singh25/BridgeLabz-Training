import java.util.Scanner;

public class ChocolateDistribution {
	// Creating a method to check the numbers
	public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren){
	
		int quotient=numberOfchocolates / numberOfChildren;
		int remainder=numberOfchocolates % numberOfChildren;
		// return the values in form of an array
		return new int[] {quotient,remainder};
		
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your number of chocolates and the children ");
		int numberOfchocolates=sc.nextInt();
		int numberOfChildren=sc.nextInt();
		
		// call the method and store results in array
		int [] array=findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
		
		
		// displaying the results using 
		System.out.println("the number of chocolates each child will get is :"+ array[0] + "\n the remaining chocolates : "+ array[1]);
	}
}