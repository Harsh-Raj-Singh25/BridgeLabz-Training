import java.util.*;
public class NaturalSum{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Taking input from the user
        System.out.println("Enter your number");
		int number=s.nextInt();
		//Check whether the number is natural or not. If yes display the sum of n natural numbers. otherwise display it's not natural
		if(number>=0){
			int sum=0;
			for(int i=0;i<=number;i++){
				sum+=i;
			}
			System.out.println("The sum of "+ number+" natural numbers is "+ sum);
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
	}
}