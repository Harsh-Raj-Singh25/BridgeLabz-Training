import java.util.*;

public class GradeCalculator{
	// methods:
	public static int[][] generate(int n){
		int[][] arr = new int[n][6];
		Random r = new Random();
		for(int i =0;i<n;i++){
			for(int j =0;j<3;j++){
				arr[i][j]= r.nextInt(89)+10;
			}
		}
		return calculation(arr);
	}
	public static int[][] calculation(int[][] arr){
		for(int i =0;i<arr.length;i++){
			arr[i][3]= arr[i][0]+arr[i][1]+arr[i][2];
			arr[i][4]= (arr[i][0]+arr[i][1]+arr[i][2])/3;
			arr[i][5]= (arr[i][0]+arr[i][1]+arr[i][2])/3;
		}
		return arr;
	}
	// method to calculate grade
	public static String grade(int n){
		if(n>=80){
			return "A Grade";
		}
		if(n>=70&&n<=79){
			return "B Grade";
		}
		if(n>=60&&n<=69){
			return "C Grade";
		}
		if(n>=50&&n<=59){
			return "D Grade";
		}
		if(n>=40&&n<=49){
			return "E Grade";
		}
		return "R Grade";
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// take user input
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		
		int[][] arr = generate(n);
		// output
		for(int[] a:arr){
			System.out.println(Arrays.toString(a)+" optained "+grade(a[4]));
		}
	}
	
}