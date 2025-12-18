import java.util.*;
public class IntOperation{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
        System.out.println("Enter your numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		//Operations
		int operation1= a + b *c;
		int operation2= a*b + c;
		int operation3= c + a / b;
		int operation4= a % b + c;
		
		// Printing the results
		System.out.println(" The results of Int Operations are"+ operation1+", "+ operation2+ ", "+operation3+" and " + operation4);
	}
}
