import java.util.*;
public class Anagrams{
	// method to check anagram
	public static boolean checkAnagram(String s1, String s2){
		// removing all spaces and converting in lowercase
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		char[] array1=s1.toCharArray();
		char[] array2=s2.toCharArray();
		// sorting
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		// checking for equality and returning the result		
		return Arrays.equals(array1, array2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your string 1 : ");
        String s1 = sc.nextLine();
		System.out.print("Enter your string 2 : ");
        String s2 = sc.nextLine();
		// using method display result
		System.out.println("The given strings are anagrams: "+ checkAnagram(s1,s2) );
		
		sc.close();
	}
}