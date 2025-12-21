import java.util.Scanner;

public class LeapChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// take year as input from the user
        System.out.print("Enter your year: ");
        int year = sc.nextInt();
		// check for gregorian rules:
        if (year < 1582) {
			System.err.println("Invalid year as Gregorian calendar rules only apply from year 1582 ");
            System.exit(0);
        } else {
			// call the method
            if (checkLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        sc.close();
    }
	// Method:
    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}