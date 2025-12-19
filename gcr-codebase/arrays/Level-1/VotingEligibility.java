import java.util.*;
public class VotingEligibility{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// defining the array of size 10
		int [] array=new int [10];
		//Take age as input from all ten students using for loop
        System.out.println("Enter your ages");
		for(int i=0;i<array.length;i++){
			array[i]=s.nextInt();
		}
		
		// looping through the array and check the eligibility of All the students
		for(int i=0;i<array.length;i++){
			// Invalid case:
			if(array[i]<=0){
				System.err.println("Invalid age");
			}
			else if(array[i]>=18){
				System.out.println("The student with the age "+ array[i] +" can vote.");
			}else{
				System.out.println("The student with the age "+ array[i] +" cannot vote. ");
			}
		}
		
		s.close();
	}
}
		
		
		
		