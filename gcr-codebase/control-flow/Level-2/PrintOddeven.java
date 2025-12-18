import java.util.*;
public class PrintOddeven{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking input from the user
        System.out.println("Enter your number");
		int number=s.nextInt();
		int numberCopy=number;
		
		//Check whether the number is natural or not. If yes print even or odd 
		if(number>=0){
			for(int i=1;i<number;i++){
				if(i%2==0){
					System.out.println( "The number is even: "+i);
				}else{
				    System.out.println("the number is odd: "+i );
				}
			}
			
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
		
		
	}
}
		
		