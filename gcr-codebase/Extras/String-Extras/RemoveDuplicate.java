import java.util.*;
public class RemoveDuplicate{
	// method to remove dublicates
	public static String removeDuplicate(String s){
		String unique="";
		for(int i=0;i<s.length();i++){
			String currentChar = String.valueOf(s.charAt(i));
            // We check if the result string ALREADY has this character
            if (!unique.contains(currentChar)) {
                unique += currentChar;
            }
		}
		return unique;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
		// using method and displaying the desired output
		System.out.println("The string after removing duplicates is : "+ removeDuplicate(s));
		
		sc.close();
	}
}