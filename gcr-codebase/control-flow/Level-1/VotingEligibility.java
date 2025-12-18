import java.util.*;
public class VotingEligibility{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking age as input from the user
        System.out.println("Enter your age");
		int age=s.nextInt();
		// check whether the user is eligible to vote or not.
		if(age >= 18){
			System.out.println("The person's age is "+age+ " and can vote.");
		}else{
		    System.out.println("The person's age is "+age+ " and cannot vote.");
		}
	}
}
		