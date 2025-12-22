import java.util.*;

public class NumberChecker{
	public static void main(String args[]){
	    // take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int size = numSize(num);
		// display size
		System.out.println("Size of number is: "+size);
		int digArray[] = digitArr(num, size);
		// display digits
		System.out.println("Digit array of number is: "+Arrays.toString(digArray));
		System.out.println("This number is duck number: "+duckNumber(digArray));
		System.out.println("This number is ArmStrong number: "+armStrong(num, size));
		int max[] = maxSecMax(digArray);
		System.out.println("Largest digit is: "+max[0]+" Second Largest number is: "+max[1]);
		int min[] = minSecMin(digArray);
		System.out.println("Smallest number is: "+min[0]+" Second smallest number is: "+min[1]);
		
	}
	// methods: for size, digits, duck number, armstrong, maximum and minimum
	public static int numSize(int num){
		int cnt =0;
		while(num>0){
			cnt++;
			num/=10;
		}
		return cnt;
	}
	public static int[] digitArr(int num,int size){
		int arr[] = new int[size];
		
		while(num>0){
			arr[size-1] = num%10;
			size--;
			num/=10;
		}
		return arr;
	}
	public static boolean duckNumber(int arr[]){
		for(int i:arr)
			if(i==0)
				return true;
		return false;
	}
	public static boolean armStrong(int num, int size){
		int sm = 0;
		int temp =num;
		while(temp>0){
			sm+= (int)Math.pow(temp%10,size);
			temp/=10;
		}
		if(sm==num)
			return true;
		return false;
	}
	public static int[] maxSecMax(int arr[]){
		int max = Integer.MIN_VALUE;
		int secMax= Integer.MIN_VALUE;
		
		for(int i:arr){
			if(i>max){
				secMax =max;
				max = i;
			}
			else if(i>secMax)
				secMax=i;
		}
		int mx[] = {max,secMax};
		return mx;
	}
	public static int[] minSecMin(int arr[]){
		int min = Integer.MAX_VALUE;
		int secMin= Integer.MAX_VALUE;
		
		for(int i:arr){
			if(i<min){
				secMin =min;
				min = i;
			}
			else if(i<secMin)
				secMin=i;
		}
		int mn[] = {min,secMin};
		return mn;
	}
}