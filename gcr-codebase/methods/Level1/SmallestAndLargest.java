import java.util.Scanner;

public class SmallestAndLargest {
	// Creating a method to check the numbers
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		// initialize the largest and the smallest
		int largest=number3;
		int smallest=number3;
		// check for largest
		if(number1>number2 && number1>number3){
			largest=number1;
		}else if(number2>number1 && number2>number3){
			largest=number2;
		}
		// check for smallest
		if(number1<number2 && number1<number3){
			smallest=number1;
		}else if(number2<number1 && number2<number3){
			smallest=number2;
		}
		// return the values in form of an array
		return new int[] {largest,smallest};
		
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your numbers ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
		// call the method and store results in array
		int [] array=SmallestAndLargest.findSmallestAndLargest(number1,number2,number3);
		
		// displaying the results using 
		System.out.println("The largest number is :"+ array[0] + "\n The smallest number is : "+ array[1]);
	}
}