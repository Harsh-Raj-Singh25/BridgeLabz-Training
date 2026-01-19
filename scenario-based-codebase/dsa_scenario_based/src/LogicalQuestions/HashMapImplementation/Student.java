package LogicalQuestions.HashMapImplementation;

public class Student {
	public static void main(String[] args) {
		MyHashMap students =new MyHashMap();
		
		students.put(78, "Harsh Raj Singh ");
		students.put(115, "Namrata Khapre");
		students.put(101, "Anand Singh");
		
		System.out.println(students.get(78));
		System.out.println(students.get(101));
		
	}
}
