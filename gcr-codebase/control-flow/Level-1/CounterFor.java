import java.util.*;
public class CounterFor{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// Take input counter from the user
        System.out.println("Enter your number");
		int counter=s.nextInt();
		
		// Using for loop to keep printing the counter and decrement it till it becomes one
		for(int i=counter;i>=1;i--){
			System.out.println(i);
		}
	}
}