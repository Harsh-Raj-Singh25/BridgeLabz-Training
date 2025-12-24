import java.util.*;
public class SubstringCounter{
	// method to count how many times a given substring occurs in a string.
	public static int subStringCount(String str, String subs){
		String s=str.toLowerCase();
		//converting the string in an array of words
		String [] words= s.split(" ");
		// initializing the count
		int count=0;
		// using the loop and finding the substring and increasing the count
		for(int i=0;i<words.length;i++){
			if(subs.equals(words[i])){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
		System.out.print("Enter your Substring : ");
        String subs = sc.next();
		// using method to check for substring and display count
		System.out.println("The given substring occurs "+ subStringCount(s,subs) + " times" );
		
		sc.close();
	}
}