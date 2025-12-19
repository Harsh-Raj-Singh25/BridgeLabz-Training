import java.util.*;
public class EvenOdd{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//take an integer input
		System.out.println("Enter your number");
		int number=s.nextInt();
		
		// check for Invalid not natural number
		if(number<=0){
			System.err.println("Invalid number");
            System.exit(0);
        }
		
		// defining the even array 
		int [] even=new int [number/2+1];
		int evenIndex=0;
		// defining the odd array and index variable
		int [] odd=new int [number/2+1];
		int oddIndex=0;
		
		// Run a loop from 1 to number and store the results in even and odd array accordingly		
		for(int i = 1 ;i<number;i++){
			if(i%2==0){
				even[evenIndex++]=i;
			}else{
				odd[oddIndex++]=i;
			}	
		}
		
		
		// looping through the both the arrays and displaying the elements
		System.out.println(" The odd numbers are:");
		for(int i=0;i<odd.length;i++){
			System.out.println(odd[i]);
		}
		System.out.println(" The even numbers are:");
		for(int i=0;i<even.length;i++){
			System.out.println(even[i]);
		}
		
		s.close();
	}
}