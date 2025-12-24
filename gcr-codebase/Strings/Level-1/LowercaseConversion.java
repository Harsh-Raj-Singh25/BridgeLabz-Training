import java.util.*;
public class LowercaseConversion{
	// method to convert from  uppercase:
	public static String convertUppercaseToLowercase(String str) {
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
                result.append(originalChar);
            }
        }
        return result.toString();
    }
	// comparison method
	public static boolean stringEquals(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}return true;
	}
	
	// main method
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println("enter your String s1:");
		String s1=sc.nextLine();
		// converting to lowercase using built-in method
		String s2=s1.toLowerCase();
		// converting to uppercase using created method
		String s3=convertUppercaseToLowercase(s1);
		// comparing the two strings and displaying result
		if(s2.length()!=s3.length()){
			System.out.println(" the two strings are not equal");
			System.exit(0);
		}else{
			if(stringEquals(s2,s3)){
					System.out.println(" the two strings are equal");
			}else{
				System.out.println(" the two strings are not equal");
				System.exit(0);
			}
		}
		
		sc.close();
	}

}