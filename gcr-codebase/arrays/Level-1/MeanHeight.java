import java.util.*;
public class MeanHeight{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// defining the array of heights
		double [] heights=new double [11];
		//initilize the sum variable
		double sum=0.0;
		// Run a loop and get user input		
		for(int i = 0 ;i<heights.length;i++){
			heights[i]=s.nextDouble();
			sum+=heights[i];
		}
		
		
		//Print the mean heights
		System.out.println("the mean height of the team is : "+ (sum/11));
		
		
		s.close();
	}
}