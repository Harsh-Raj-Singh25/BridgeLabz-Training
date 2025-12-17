public class DividePen{
    public static void main(String [] args){
	    
		int pen=14;
		int students=3;
		// Pen per student
		int pen_per_student = pen/students;
		// remaining pens
		int remaining_pen=pen%students;
		
		// Printing the results
		System.out.println("The Pen Per Student is "+ pen_per_student+" and the remaining pen not distributed is " +remaining_pen);
	}
}