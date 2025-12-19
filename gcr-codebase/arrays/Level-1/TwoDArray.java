import java.util.*;
public class TwoDArray{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//take the row and column for array
		System.out.println("Enter the row and column");
		int row=s.nextInt();
		int column=s.nextInt();
		// create the 2-D array
		int [] [] array=new int[row][column];
		// take user input
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				array[i][j]=s.nextInt();
			}
		}
		// create a 1D array 
		int [] newArray=new int[row * column];
		int ind = 0;
		
		// looping through the 2D array by using nested loops
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				newArray[ind++]=array[i][j];
			}
		}
		
		// displaying the output
		System.out.println("the elements of flattened array are: ");
		for(int i=0;i<ind;i++){
			System.out.print(newArray[i]);
		}
	}
}
				