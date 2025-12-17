import java.util.*;
public class MaxHandshakesCount{
    public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of students");
		int n=sc.nextInt(); // n--> numberOfStudents
		// calculate maximum possible number of handshakes
		int MaxCount=(n * ( n - 1 ) ) / 2;
		
		// Output
		System.out.println("total number of possible handshakes is "+ MaxCount);
	}
}