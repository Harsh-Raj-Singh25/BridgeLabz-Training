import java.util.Scanner;

public class CheckNumber {
	// method to check positivity
	public static boolean isPositive(int n) { 
		return n >= 0; 
	}
	// method to check even
    public static boolean isEven(int n) {
		return n % 2 == 0; 
	}
	// method to compare
    public static int compare(int n1, int n2) {
        if (n1 > n2){
			return 1;
		}
        if (n1 == n2) {
			return 0;
		}else{
			return -1;
		}
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// declare array of 5 numbers
        int[] nums = new int[5];
		
		// using loop traverse through the array and check for positivity, even and odd:
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            
            if (isPositive(nums[i])) {
                System.out.print("Positive and ");
                System.out.println(isEven(nums[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }
		// compare the numbers
        int comp = compare(nums[0], nums[4]);
        String result = (comp == 1) ? "Greater Than" : (comp == 0) ? "Equal To" : "Less Than";
        System.out.println("First element is " + result + " the last element.");
        
        sc.close();
    }

    
}