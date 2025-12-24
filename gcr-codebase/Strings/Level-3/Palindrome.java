import java.util.*;
public class Palindrome {
    // Logic 1: Iterative method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }
        return Arrays.equals(originalArray, reverseArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// take user input
        System.out.print(" Enter string: ");
        String input = scanner.nextLine();
        boolean resultIterative = isPalindromeIterative(input);
        boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean resultUsingArrays = isPalindromeUsingArrays(input);
        System.out.println("palindrome (Iterative) : " + resultIterative);
        System.out.println("palindrome (Recursive) : " + resultRecursive);
        System.out.println("palindrome (Using Arrays) : " + resultUsingArrays);

        scanner.close();
    }
}