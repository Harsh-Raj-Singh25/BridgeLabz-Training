import java.util.*;
public class ReverseString{
	// method to reverse the string by reversing the char array:
	public static String reverseString(String s){
		// using stringbuilder to store the reversed string
		StringBuilder reversed = new StringBuilder();
		// loop to move from last index to first and appending in the variable reversed
		for(int i=s.length()-1;i>=0;i--){
			reversed.append(s.charAt(i));
		}
		return reversed.toString();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
		// using method display the desired output
		System.out.println("The reversed string is: "+ reverseString(s));
		
		sc.close();
	}
}