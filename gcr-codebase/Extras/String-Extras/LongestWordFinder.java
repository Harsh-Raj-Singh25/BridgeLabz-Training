import java.util.*;
public class LongestWordFinder{
	// method to find longest word in a string
	public static String longestWord(String s){
		//converting the string in an array of words
		String [] words= s.split(" ");
		// initializing the longestLength and the index of longest word
		int longest=0;
		int index=0;
		// using the loop and finding the word with maximum length
		for(int i=0;i<words.length;i++){
			if(longest<words[i].length()){
				longest=words[i].length();
				index=i;
			}
		}
		return words[index];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
		// using method to check for longest word and display the desired output
		System.out.println("The longest word in this string is : "+ longestWord(s) );
		
		sc.close();
	}
}