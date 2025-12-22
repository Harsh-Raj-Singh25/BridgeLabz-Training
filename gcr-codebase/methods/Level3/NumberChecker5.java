import java.util.*;

// program to check various properties of a number such as perfect number, abundant number, deficient number, Strong number
class NumberChecker5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		// take user input
		System.out.println("enter your number");
        int number = sc.nextInt();
		
		// display the results using methods:
        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrong(number));
		
    }
	// creating all the methods for different-different task 
	// check if perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
	// check if abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }
	// check if deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }
	// check for strong number 
	public static boolean isStrong(int num){
		int sm =0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				int fact=1;
				for(int j=1;j<=i;j++)
					fact*=j;
				sm+=fact;
			}
		}
			
		return sm==num;
	}
}