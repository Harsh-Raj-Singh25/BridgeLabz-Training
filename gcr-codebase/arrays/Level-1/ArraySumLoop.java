import java.util.*;
public class ArraySumLoop{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// defining the array of size 10
		double [] array=new double [10];
		//defining a sum variable
		double sum=0.0;
		// initializing the index variable
		int index=0;
		// use the while loop
		while(true){
			int input=s.nextInt();
			if(input<=0){
				break;
			}
			if(index>=10){
				break;
			}
			array[index]=input;
			index++;
		}
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		
		// final output
		System.out.println("the sum is : "+ sum);
		
		
		s.close();
	}
}