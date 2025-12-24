import java.util.*;
public class CheckPalindrome{
	// method to reverse string
	public static String reverseString(String s){
		return new StringBuilder(s).reverse().toString();
	}
	// we can also use following method
	public static boolean isPalindrome(String s) {
		String input=s.toLowerCase();
		int left = 0;
		int right = input.length() - 1;
		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
		// storing the reverse of string in a variable using reverse method
		String s1=reverseString(s);
		// using method to check for equality and display the desired output
		System.out.println("The reversed string is palindrome : "+ s1.equals(s));
		// using isPalindrome method
		System.out.println("The reversed string is palindrome : "+isPalindrome(s));
		
		sc.close();
	}
}

	