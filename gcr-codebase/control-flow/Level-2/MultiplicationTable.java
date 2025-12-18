import java.util.*;
public class MultiplicationTable{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		//Taking the number from the user
        System.out.println("Enter the number");
		int number=sc.nextInt();
		
		//Using for loop, print the multiplication table
	    for(int i=6;i<=9;i++){
			System.out.println(number +" * "+i+" = "+(number*i));
		}
		
		sc.close();
	}
}