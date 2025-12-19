import java.util.*;
public class FizzBuzzArray{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		//Taking input number
        System.out.println("Enter the number:");
		int number=sc.nextInt();
		// initialize the array to save the results
		String []array= new String[number];
		//check for positive number 
		if(number<=0){
			System.out.println("The number entered is not positive");
		}else{
		     // using for loop
			for(int i=0;i<number;i++){
				// check if the number is multiple of 3 and 5
				if(i%3==0 && i%5==0){
					array[i]="FizzBuzz";
				}else if(i %3==0){
					array[i]="Fizz";
				}else if(i %5==0){
					array[i]="Buzz";
				}else{
					array[i]=String.valueOf(i);
				}
			}
		}
		
		// Displaying the results
		for(int i=0;i<array.length;i++){
			System.out.println("Position "+i+ " = "+ array[i]);
		}
		
		sc.close();
	}
}