import java.util.*;
public class RemoveCharacter{
	// method to modify the string
	public static String remover(String s, char c){
		// initializing a stringbuilder to store new string
		StringBuilder s1=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=c){
				s1.append(s.charAt(i));
			}
		}
		return s1.toString();
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println(" enter your string: ");
		String s=sc.next();
		System.out.println("enter the character to be removed");
		char c=sc.next().charAt(0);
		
		// using method clear the character and display the resultant string
		System.out.println(" The resultant String is : "+ remover(s,c));
		
		sc.close();
	}
}
		
		