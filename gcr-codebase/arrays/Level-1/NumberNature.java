import java.util.*;
public class NumberNature{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		// defining the array of size 5
		int [] array=new int [5];
		//Take input using for loop
        System.out.println("Enter your numbers");
		for(int i=0;i<array.length;i++){
			array[i]=s.nextInt();
		}
		
		// looping through the array and check All the numbers
		for(int i=0;i<array.length;i++){
			// Invalid case:
			if(array[i]<0){
				System.err.println("Negative Number");
			}else if(array[i]==0){
				System.out.println("Zero");
			}
			else if(array[i]>0){
			    if(array[i]%2==0){
					System.out.println("The number "+ array[i] +" is positive and even");
			    }else{
					System.out.println("The number"+ array[i] +" is positive and odd. ");
				}
			}
		}
		
		s.close();
	}
}