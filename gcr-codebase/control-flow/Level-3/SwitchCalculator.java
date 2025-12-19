import java.util.*;
public class SwitchCalculator{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take numbers and the desired operation as input
        System.out.println("Enter your numbers");
		double first=s.nextInt();
		double second=s.nextInt();
		System.out.println("Enter your operation out of +, - , * , / ");
		String op=s.next();
		
		// Switch case operation to perform operation based on op
		switch(op){
			case "+":
				System.out.println("Addition result is : "+ (first + second));
				break;
			case "-":
				System.out.println("Subtraction result is : "+ (first - second));
				break;
			case "*":
				System.out.println("Multiplication result is : "+ (first * second));
				break;
			case "/":
				System.out.println("Division result is : "+ (first / second));
				break;
			default :
				System.out.println("Invalid operation");
		}
		
		s.close();
	}
}
			
		
		
		