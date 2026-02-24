package specialQues.smartTrackerAppArray;

public class ArrayMethods {
	public static double sumArray(int[] array) {
		double total=0;
		for(int i=0;i<array.length;i++) {
			total+=array[i];
		}
		return total;
	}
	
	public static double averageArray(int [] array) {
		return ArrayMethods.sumArray(array)/7;
	}
	
	public static int highestArray(int [] array) {
		int highest=array[0];
		for(int i=0;i<7 ; i++) {
			if(array[i]>highest) {
				highest=array[i];
			}
		}
		return highest;
	}
	public static int highestIndex(int [] array) {
		int highest=ArrayMethods.highestArray(array);
		for(int i=0;i< array.length;i++) {
			if(array[i]==highest) {
				return i;
			}
		}
		return -1;
	}
	
	public static int lowestArray(int [] array) {
		int lowest=array[0];
		for(int i=0;i<7 ; i++) {
			if(array[i]<lowest) {
				lowest=array[i];
			}
		}
		return lowest;
	}
	public static int lowestIndex(int [] array) {
		int lowest=ArrayMethods.lowestArray(array);
		for(int i=0;i< array.length;i++) {
			if(array[i]==lowest) {
				return i;
			}
		}
		return -1;
	}
	
	
	// method to count hot days
	public static int countSpecificDays(int [] array,int limit) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>limit) {
				count++;
			}
		}
		return count;
	}
	public static int findSpecific(int [] array, int data) {
		for (int i=0;i< array.length;i++) {
			if(array[i]==data) {
				return i+1;
			}
		}
		return -1;
	}
	
	
	public static int[] updateRecords(int [] array, int target, int value) {
		array[target-1]=value;
		return array;
	}
	
	
	
}
