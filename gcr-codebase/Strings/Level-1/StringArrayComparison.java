import java.util.*;
public class StringArrayComparison{
	// method to create the strings Array:
	public static char[] stringArray(String s1){
		char [] array=new char[s1.length()];
		for(int i=0;i<s1.length();i++){
			array[i]=s1.charAt(i);
		}
		return array;
	}
	// method to compare two string arrays
	public static boolean compareArray(char[] array1, char[] array2){
		if(array1.length != array2.length){
			return false;
		}
		else{
			for(int i=0;i<array1.length;i++){
				if(array1[i] != array2[i]){
					return false;
				}
			}
			return true;
		}
	}
	// main method
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println("enter your String s1:");
		String s1=sc.next();
		// creating char array using user defined method
		char [] array1=stringArray(s1);
		// creating char array using built-in method
		char [] array2= s1.toCharArray();
		 
		// using comparison method to display the result
		if(compareArray(array1, array2)){
			System.out.println("equal");
		}else{
			System.out.println("unequal");
		}
	}

}