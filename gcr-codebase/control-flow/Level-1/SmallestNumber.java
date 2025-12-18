import java.util.*;
public class SmallestNumber{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking input from user
        System.out.println("Enter your numbers");
		int number1=s.nextInt();
		int number2=s.nextInt();
		int number3=s.nextInt();
		
		//checking whether number1 is smallest and Printing the results
		System.out.println("Is the first number the smallest?"+ (number1<number2 && number1<number3));
	}
}