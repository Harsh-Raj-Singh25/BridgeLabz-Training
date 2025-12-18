import java.util.*;
public class PositiveNegative{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take input from user
        System.out.println("Enter your number");
		int number=s.nextInt();
		//check whether the number is positive or negative or zero . print the results
		if(number>0){
			System.out.println("Positive");
		}else if(number<0){
			System.out.println("negative");
		}else{
			System.out.println("Zero");
		}
	}
}
