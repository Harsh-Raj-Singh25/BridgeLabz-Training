import java.util.*;

public class OtpGenerator{
	public static void main(String args[]){
		int arr[] = new int[10];
		
		for(int i=0;i<10;i++){
			arr[i] =generateOTP();
		}
		// display the results
		System.out.println("random OTP generated sucessfully");
		System.out.println("Generated OTP array is: "+Arrays.toString(arr));
		System.out.println("Only unique OTP generated: "+uniqueOTP(arr));
		
	}
	// Methods:
	public static int generateOTP(){
		int num = (int)(Math.random()*999999+100000);
		return num;
	}
	public static boolean uniqueOTP(int arr[]){
		Set<Integer> otp = new HashSet<>();
		for(int i:arr)
			otp.add(i);
		return otp.size()==arr.length;
	}
}