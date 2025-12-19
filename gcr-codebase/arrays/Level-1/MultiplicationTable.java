import java.util.*;
public class MultiplicationTable{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//take an integer input
		System.out.println("Enter your number");
		int number=s.nextInt();
		// defining the array of size 10
		int [] array=new int [10];
		// Run a loop from 1 to 10 and store the results in the multiplication table array
        int counter=1;		
		for(int i = 1 ;i<=array.length;i++){
			array[i-1]=number * i;
			
		}
		
		// looping through the array and displaying the table
		System.out.println(" The multiplication table is:");
		int counter1=1;
		for(int i=0;i<array.length;i++){
			System.out.println(number+" * " + counter1 + " = "+ array[i]);
			counter1++;
		}
		
		s.close();
	}
}