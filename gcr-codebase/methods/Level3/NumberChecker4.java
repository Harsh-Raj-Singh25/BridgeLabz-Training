import java.util.*;
// program to check various properties of a number such as Prime, Neon, SpyNumber, Spy Number, Automorphic number 
class NumberChecker4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println(" Enter your number");
        int number = sc.nextInt();
		// display the results using methods:
        System.out.println("Prime Number: " + isPrimeNumber(number));
        System.out.println("Neon Number: " + isNeonNumber(number));
        System.out.println("Spy Number: " + isSpyNumber(number));
        System.out.println("Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Buzz Number: " + isBuzzNumber(number));
    }
	// check for prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
	// check for neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
	// check for spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }
	// check for automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
	// check for buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }
}