import java.util.*;
public class StringComparison{
	// method to compare the strings:
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
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println("enter your first String s1:");
		String s1=sc.next();
		System.out.println("enter your second String s2:");
		String s2=sc.next();
		// using method display the output
		if(stringEquals(s1,s2)){
			System.out.println(" the two strings are equal");
		}else{
			System.out.println(" the two strings are not equal");
		}
	}

}
		