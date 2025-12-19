import java.util.*;
public class Grades{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		
		//Take marks as input
        System.out.println("Enter your marks");
		int math=s.nextInt();
		int physics=s.nextInt();
		int chemistry=s.nextInt();
		//compute percentage and then grade
		int percentage=(math + physics + chemistry)/3;
		if(percentage>80){
			System.out.println("With " + percentage+ " you got Level-4, above agency-normalized standards");
		}else if(percentage > 70 && percentage<80){
			System.out.println("With " + percentage+ " you got Level-3, at agency-normalized standards");
		}else if(percentage>60 && percentage<70){
			System.out.println("With " + percentage+ " you got Level-2, below, but approaching agency-normalized standards");
		}else if(percentage>50 && percentage<60){
			System.out.println("With " + percentage+ " you got Level-1, well below agency-normalized standards");
		}else if(percentage>40 && percentage<50){
			System.out.println("With " + percentage+ " you got Level-1, too below agency-normalized standards");
		}else{
             System.out.println("With " + percentage+ " : remedial standards");		
		}	 
		s.close();
	}
}