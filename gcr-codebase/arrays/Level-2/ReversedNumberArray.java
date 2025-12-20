import java.util.Scanner;

class ReversedNumberArray{ 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
		
		// Take user input
		System.out.println("Tell your number");
		int number=sc.nextInt();
		//counting the digits
		int count=0;
		int tempNum=number;
		while(tempNum!=0){
			tempNum/=10;
			count++;
		}
		// saving the digits in an array
		int [] digits=new int[count];
		int tempNum1=number;
		for(int i=0;i<count;i++){
			digits[i]=(int) tempNum1 % 10;
			tempNum1 /= 10;
		}
		// saving the digits in a reversed array
		// technically the array already stores the digits in a reversed manner because we stored last digits sequentially.
		
		
		// displaying the result
		System.out.println("The digits in reversed are: ");
		for(int digit : digits){
			System.out.print(digit);
		}
		sc.close();
	}
}
			
			
			
			
		