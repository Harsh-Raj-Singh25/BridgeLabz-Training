import java.util.*;
public class BasicCalculator{
    public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		float number1=s.nextFloat();
		System.out.println("Please enter the second number: ");
		float number2=s.nextFloat();
		// ARITHMETIC OPERATIONS:-
		float addition = number1 + number2;
		float subtraction = number1 - number2;
		float multiplication = number1 * number2;
		float division = number1 / number2;
		
		// Print the results
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + 
		number1+" and "+ number2 +" is : "+ addition + ", "+ subtraction+", "+multiplication+" and " + division);
	}
}