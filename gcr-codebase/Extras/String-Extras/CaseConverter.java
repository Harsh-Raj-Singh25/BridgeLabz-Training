import java.util.*;
public class CaseConverter{
	// method to toggle the case of each character
	public static String caseToggler(String str) {
        // Use a StringBuilder to efficiently build the new string
        StringBuilder result = new StringBuilder();
		
        // Iterate through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char originalChar = str.charAt(i);
            // Check if the character is a uppercase letter
            if (originalChar >= 'A' && originalChar <= 'Z') {
                char lowercaseChar = (char) (originalChar + 32);
                result.append(lowercaseChar);
            } else {
                result.append((char) (originalChar - 32));
            }
        }
        return result.toString();
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.next();
		// using method to toggle case and display the result
		System.out.println("The toggled version of this string is : "+ caseToggler(s) );
		
		sc.close();
	}
}