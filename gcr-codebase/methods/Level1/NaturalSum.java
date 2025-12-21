import java.util.Scanner;

public class NaturalSum {
	
	// Creating a method to check the number
	public int sum(int number){
		int sum=0;
		for(int i=1; i<=number;i++){
			sum+=i;
		}
		return sum;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Take user input 
		System.out.println("Enter your natural number ");
		int number=sc.nextInt();
		
		// creating an object
		NaturalSum num = new NaturalSum();
		// checking for natural number and displaying the results using method
		if(number<=0){
			System.err.println("Invalid number");
            System.exit(0);
        }else{
			System.out.println("The sum of "+number+" natural numbers is "+num.sum(number));
		}
		
		sc.close();
	}
}