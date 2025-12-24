import java.util.*;
public class SubStringComparison{
	// method to create the substrings:
	public static String subString(String s1, int start, int end){
		String subs="";
		for(int i=start;i<end;i++){
			subs+=s1.charAt(i);
		}
		return subs;
	}
	// main method
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println("enter your String s1:");
		String s1=sc.next();
		System.out.println("enter your start and end index");
		int start=sc.nextInt();
		int end=sc.nextInt();
		// creating substring using built-in method
		String s2=s1.substring(start,end);
		// creating subString using created method
		String s3=subString(s1, start, end);
		// comparing the two substrings and displaying result
		if(s2.length()!=s3.length()){
			System.out.println(" the two substrings are not equal");
			System.exit(0);
		}else{
			for(int i=0;i<s3.length();i++){
				if(s2.charAt(i)!=s3.charAt(i)){
					System.out.println(" the two substrings are not equal");
					System.exit(0);
				}
			}
			System.out.println(" the two substrings are equal");
		}
		
		sc.close();
	}

}