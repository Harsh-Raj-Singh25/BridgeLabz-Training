import java.util.*;

public class StringTrimmer {
	// methods :
    static int[] trimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    static String subStringUsingCharAt(String str, int start, int end) {
        return str.substring(start,end);
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// take user input
		System.out.println(" enter your string");
        String input = sc.nextLine();
        int[] index = trimIndexes(input);
        String trimmedByUser = subStringUsingCharAt(input, index[0], index[1]);
        String trimmedByBuiltIn = input.trim();
        boolean result = compareStrings(trimmedByUser, trimmedByBuiltIn);
		// display output
        System.out.println("After trimming: " + trimmedByUser);
        System.out.println("Strings are equal: " + result);
    }
}