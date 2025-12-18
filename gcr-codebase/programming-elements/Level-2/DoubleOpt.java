import java.util.*;
public class DoubleOpt{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
        System.out.println("Enter your numbers");
		double a=s.nextInt();
		double b=s.nextInt();
		double c=s.nextInt();
		//Operations
		double operation1= a + b *c;
		double operation2= a*b + c;
		double operation3= c + a / b;
		double operation4= a % b + c;
		
		// Printing the results
		System.out.println(" The results of Int Operations are"+ operation1+", "+ operation2+ ", "+operation3+" and " + operation4);
	}
}