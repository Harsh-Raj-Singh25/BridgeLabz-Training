import java.util.*;

public class NumberChecker3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// take user input
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		// using methods perform the operations and display the result
		int size = numSize(num);
		System.out.println("Size of number is: "+size);
		int digArray[] = digitArr(num, size);
		System.out.println("Digit array of number is: "+Arrays.toString(digArray));
		int revArr[] = reverse(digArray);
		System.out.println("Reverse of array is: "+Arrays.toString(revArr));
		System.out.println("Number is palindrome: "+isPalindrome(digArray));
		System.out.println("Number is ducknumber: "+ duckNumber(digArray));
		System.out.println("Both arrays and reverse of array are equal: "+equalArr(digArray,revArr));
	}
	
	//Methods:-
	// check size
	public static int numSize(int num){
		int cnt =0;
		while(num>0){
			cnt++;
			num/=10;
		}
		return cnt;
	}
	// find the digits and store those in an array
	public static int[] digitArr(int num,int size){
		int arr[] = new int[size];
		
		while(num>0){
			arr[size-1] = num%10;
			size--;
			num/=10;
		}
		return arr;
	}
	// check for duckNumber
	public static boolean duckNumber(int arr[]){
		for(int i:arr)
			if(i==0)
				return true;
		return false;
	}
	// find reverse
	public static int[] reverse(int arr[]){
		int l = 0;
		int r= arr.length-1;
		while(l<r){
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		return arr;
	}
	//check for palindrome
	public static boolean isPalindrome(int arr[]){
		int l = 0;
		int r= arr.length-1;
		while(l<r){
			if(arr[l]!=arr[r])
				return false;
			l++;
			r--;
		}
		return true;
	}
	// check for equality
	public static boolean equalArr(int arr1[], int arr2[]){
		if(arr1.length != arr2.length)
			return false;
		for(int i=0;i<arr1.length;i++)
			if(arr1[i] != arr2[i])
				return false;
			
		return true;
	}
}