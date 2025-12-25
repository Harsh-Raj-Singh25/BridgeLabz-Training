import java.util.*;
public class PalindromeChecker {
	// method
    public static boolean isPalindrome(String text, int start, int end) {
		check if the start is greater than or equal to end?
        if (start >= end) {
            return true;
        }
		// comparing start  and end characters
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindrome(text, start + 1, end - 1);
    }
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("palindrome  : " + result);

        scanner.close();
    }
}