package csvData.advanced_problems;

import java.io.*;
import java.util.*;

class Student {
	int id;
	String name;
	int marks;

	public Student(String name, int id, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student{ID=" + id + ", Name='" + name + "', Marks=" + marks + "}";
	}
}

public class CSVToObjects {
	public static void main(String[] args) {
		// Try the relative path from the project root
		File file = new File("src/main/java/csvData/student.csv");

		if (!file.exists()) {
			System.out.println(" Error: File not found at " + file.getAbsolutePath());
			return;
		}

		List<Student> students = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine(); // Read header
			while ((line = br.readLine()) != null) {
				String[] d = line.split(",");
				students.add(new Student( d[0].trim(),Integer.parseInt(d[1].trim()), Integer.parseInt(d[3].trim())));
			}
			students.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}