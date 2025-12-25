import java.util.*;
public class GCDLCMCalculator {
    // GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM using the relationship between GCD and LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("first number: ");
        int num1 = sc.nextInt();
        System.out.print("second number: ");
        int num2 = sc.nextInt();
		
		// using methods to perform operations and then displaying results:
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}