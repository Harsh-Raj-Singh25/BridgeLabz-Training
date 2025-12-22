import java.util.*;

public class MatrixManipulation{ 	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// user input
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter number of column: ");
		int col = sc.nextInt();
		// using methods:
		int mat1[][] = generateMat(row,col);
		int mat2[][] = generateMat(row, col);
		int addMat[][] = matAddition(mat1,mat2);
		int subMat[][] = matSubtraction(mat1, mat2);
		int multi[][] = matMultiplication(mat1, mat2);
		
		// display output
		System.out.println("first matrix is: ");
		
		for(int i=0;i<row;i++){
			System.out.print("[");
			for(int j =0;j<col;j++)
				System.out.print(mat1[i][j]+" ");
			System.out.print("]");
			System.out.println();
		}
			
		System.out.println("Second matrix is: ");
		for(int i=0;i<row;i++){
			System.out.print("[");
			for(int j =0;j<col;j++)
				System.out.print(mat2[i][j]+" ");
			System.out.print("]");
			System.out.println();
		}
			
		System.out.println("Addition of matrix is: ");
		for(int i=0;i<row;i++){
			System.out.print("[");
			for(int j =0;j<col;j++)
				System.out.print(addMat[i][j]+" ");
			System.out.print("]");
			System.out.println();
		}
			
		System.out.println("Subtraction of matrix is: ");
		for(int i=0;i<row;i++){
			System.out.print("[");
			for(int j =0;j<col;j++)
				System.out.print(subMat[i][j]+" ");
			System.out.print("]");
			System.out.println();
		}
			
		System.out.println("Multiplication of matrix is: ");
		for(int i=0;i<multi.length;i++){
			System.out.print("[");
			for(int j =0;j<multi[0].length;j++)
				System.out.print(multi[i][j]+" ");
			System.out.print("]");
			System.out.println();
		}
	}
	
	// Methods:
	public static int[][] generateMat(int r, int c){
		int mat[][] = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j =0;j<c;j++)
				mat[i][j] = (int)(Math.random()*9+1);
			
		return mat;
	}
	public static int[][] matAddition(int mat1[][], int mat2[][]){
		int r = mat1.length;
		int c = mat1[0].length;
		
		if(r!=mat1.length && c!=mat2[0].length)
			return null;
		
		int add[][] = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				add[i][j] = mat1[i][j]+mat2[i][j];
		
		return add;
	}
	public static int[][] matSubtraction(int mat1[][], int mat2[][]){
		int r = mat1.length;
		int c = mat1[0].length;
		
		if(r!=mat1.length && c!=mat2[0].length)
			return null;
		
		int sub[][] = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				sub[i][j] = mat1[i][j]-mat2[i][j];
		
		return sub;
	}
	
	public static int[][] matMultiplication(int mat1[][], int mat2[][]){
		if(mat1.length !=mat2[0].length)
			return null;
		
		int multi[][] = new int[mat1.length][mat2[0].length];
		
		for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat2[0].length;j++){
                for (int k=0;k<mat1[0].length;k++){
                    multi[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
		return multi;
	}
	
}