import java.util.*;

public class StringIllgalException{
	public static void main(String args[]){
		try{
			illegalException(5,4);
		}
		catch(IllegalArgumentException e){
			System.out.print("Exception generated: "+e);
		}
			
	}
	// method to generate exception
	public static void illegalException(int st, int ed) throws IllegalArgumentException{
		
		if(st>ed)
			throw new IllegalArgumentException();	
	}
}