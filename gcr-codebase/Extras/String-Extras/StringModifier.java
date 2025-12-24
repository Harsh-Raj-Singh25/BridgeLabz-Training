import java.util.*;
public class StringModifier{
	// method to change the word
	public static String modifyString(String s, String word , String replace){
		//converting the string in an array of words
		String [] words= s.split(" ");
		// using the loop and finding the word and changing it
		for(int i=0;i<words.length;i++){
			if(words[i].equals(word)){
				words[i]=replace;
			}
		}
		//return Arrays.toString(words);
		return String.join(" ", words);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
		System.out.print("Enter the word to be replaced : ");
        String w = sc.next();
		System.out.print("Enter the word to replace : ");
        String r = sc.next();
		// using method to check for word and display the desired modified output
		System.out.println("The new string is : "+ modifyString(s,w,r) );
		
		sc.close();
	}
}