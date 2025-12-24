
import java.util.*;
public class LexicographicalOrder{
	// method to check order
	public static int order(String str1, String str2) {
        // deciding the length of minimum string
		int length=Math.min(str1.length(),str2.length());
        // Iterate through each character of the input strings upto min length and comparing them
        for (int i = 0; i < length; i++) {
            char first=str1.charAt(i);
			char second=str2.charAt(i);
            if (first!=second) {
                return first-second;
            }
        }
		// if the strings are same upto min lenght then smaller one comes first
        return str1.length()-str2.length();
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
        System.out.print("Enter your strings : ");
        String s1 = sc.next();
		String s2 = sc.next();
		// using method to check order 
		int result=order(s1,s2);
		// comparing 
		if(result<0){
			System.out.println(s1+" comes before "+s2 +" in lexicographical order");
		}else if (result>0){
			System.out.println(s1+" comes before "+ s2+" in lexicographical order");
		}else{
			System.out.println("both are equal");
		}
		
		sc.close();
	}
}