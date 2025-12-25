import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// take user input
        System.out.print("first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("second number: ");
        double num2 = scanner.nextDouble();
		
        System.out.println("Select operation: ");
        System.out.println("1. (+)");
        System.out.println("2. (-)");
        System.out.println("3. (*)");
        System.out.println("4. (/)");

        int choice = scanner.nextInt();
        double result = 0;
		// perform selected opertion using switch to call the methods
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
	// methods for sum, subtraction, multiplication and division:
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}