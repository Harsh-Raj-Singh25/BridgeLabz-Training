import java.util.*;
public class CounterWhile{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// Take input counter from the user
        System.out.println("Enter your number");
		int counter=s.nextInt();
		
		//Using while loop to print the value of counter and decrementing it till it reaches one.
		while(counter>=1){
			System.out.println(counter);
			counter--;
		}
	}
}