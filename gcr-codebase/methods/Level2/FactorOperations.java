import java.util.*;

public class FactorOperations{
	// methods to do all the calculations:
	public static int [] factors(int number ){
		int count=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				count++;
			}
		}
		// initialize the array
		int [] array=new int[count];
		int idx=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				array[idx++]=i;
			}
		}
		return array;
	}
	public int factorsSum(int number){
		int[] array=factors(number);
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum;
	}
	public int factorsProduct(int number){
		int[] array=factors(number);
		int product=1;
		for(int i=0;i<array.length;i++){
			product*=array[i];
		}
		return product;
	}
	public int factorsSquaredSum(int number){
		int[] array=factors(number);
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i] * array[i];
		}
		return sum;
	}
	
	// main 
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		// take the number as input
		System.out.println(" enter your number");
		int number=sc.nextInt();
		
		// creating object
		FactorOperations operator=new FactorOperations();
		// using methods to find the results
		int [] factorsA=factors( number );
		int sum=operator.factorsSum(number);
		int product=operator.factorsProduct(number);
		int squaredSum=operator.factorsSquaredSum(number);
		
		// display the results
		System.out.print(" the factors are :");
		for(int i=1;i<factorsA.length;i++){
			System.out.print(factorsA[i]+" , ");
		}
		System.out.println(" ");
		System.out.println("the sum of factors: "+ sum);
		System.out.println(" the product of factors : "+product);
		System.out.println(" the sum of squared factors : "+squaredSum);
	}
}
		
	
		
			