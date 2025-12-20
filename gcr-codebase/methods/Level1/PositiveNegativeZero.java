import java.util.Scanner;

public class PositiveNegativeZero {
	
	// Creating a method to check the number
	public int numberChecker(int number){
		if(number>0){
			return 1;
		}else if(number<0){
			return -1;
		}else{
			return 0;
		}
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your number ");
		int number=sc.nextInt();
		
		// creating an object
		PositiveNegativeZero num = new PositiveNegativeZero();
		// displaying the results using method
		System.out.println(num.numberChecker(number));
	}
}

		