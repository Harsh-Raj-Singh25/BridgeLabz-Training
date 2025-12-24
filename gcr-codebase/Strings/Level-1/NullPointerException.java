import java.util.*;
public class NullPointerException{
	// method to generate exception
	public static int generateException(){
		String text=null;
		return text.length();
	}
	public static void handleException(){
		String text=null;
		try{
			System.out.println(text.length()); 
		}catch (NullPointerException e){
			System.out.println(" Caught NullPointerException: " + e.getMessage());
		}
	}
	public static void main(String args[]){
		generateException();
		try{
			generateException();
		} catch (Exception e){
			System.out.println(" Caught NullPointerException: " + e.getMessage());
		}
		System.out.println("\n ---Demonstrating exception handling(program continues to run)--");
		handleException();
		System.out.println("\nprogram has finished executing both scenarios.");
		
		
	}
}

