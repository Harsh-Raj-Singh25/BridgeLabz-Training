import java.util.*;
public class Factorial {
	// method for calculting factorial using recursion
	public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("number: ");
        int number = sc.nextInt();
        long factorial = calculateFactorial(number);
		
		// display the result
        System.out.println("factorial: " + factorial);
        sc.close();
    }

    
}