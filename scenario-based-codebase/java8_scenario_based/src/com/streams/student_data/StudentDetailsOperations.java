package com.streams.student_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDetailsOperations {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Harsh Raj Singh", "AL78", "Harsh", 21, "Male", "Mahnar", 1,
						Arrays.asList(" 9471473020", "9472094731")),
				new Student("Namrata Khapre", "AL115", "Namrata", 23, "Female", "Chhindwara", 1,
						Arrays.asList("9691564706")),
				new Student("Sarthak Rathore", "CS210", "Sarthak", 24, "Male", "Mahnar", 15,
						Arrays.asList("568965653", "8945542178")),
				new Student("Neha kumari", "Al21", "Neha", 24, "Female", "Mumbai", 132,
						Arrays.asList("9012345678", "8123456790")),
				new Student("Vikram Singh", "M23", "Vikram", 30, "Male", "Chhindwara", 56, Arrays.asList("7778889990")),
				new Student("Anjali Kumari", "CS45", "Anjali", 23, "Female", "Pune", 67, Arrays.asList("6665554443")),
				new Student("Karan Thakur", "EC23", "Karan", 26, "Male", "Bangalore", 19,
						Arrays.asList("5554443332", "9871234567")));

//		***Basic Filtering&Mapping
//
//		1. Print all students whose rank is less than 50.
		list.stream().filter(x -> x.getRank() < 50).toList().forEach(System.out::println);
//		2. Print all students whose age is greater than 25.
		System.out.println(" Age greater than 25 ");
		list.stream().filter(x -> x.getAge() > 25).toList().forEach(System.out::println);
//		3. Print the names of all students only.
		System.out.println("Name of all students :");
		list.stream().map(Student::getName).toList().forEach(System.out::println);
//		4. Print all students belonging to Mechanical Engineering.
		System.out.println(" Mechanical students ");
		list.stream().filter(x -> x.getId().startsWith("M")).forEach(System.out::println);
//		5. Print all students not from Mumbai.
		System.out.println(" Non - mumbai students ");
		list.stream().filter(x -> !x.getCity().equalsIgnoreCase("mumbai")).forEach(System.out::println);

//		***Sorting&Limiting
//
//		1.Sort students by rank (ascending).
		System.out.println(" Ascending list by rank");
		list.stream().sorted(Comparator.comparing(Student::getRank)).toList().forEach(System.out::println);
		// 2. Sort by age (descending)
		System.out.println(" Descending list by age ");
		list.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).forEach(System.out::println);

		// 3. Top 5 students based on rank
		System.out.println("Top 5 students ");
		list.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(5).forEach(System.out::println);

		// 4. Last 3 students based on rank (Sort reversed then take 3)
		System.out.println(" Last 3 students ");
		list.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).limit(3)
				.forEach(System.out::println);

		// 5. Sorted by name and then rank
		System.out.println(" Sort by name and then rank ");
		list.stream().sorted(Comparator.comparing(Student::getName).thenComparingInt(Student::getRank))
				.forEach(System.out::println);
//
//		*** Grouping & Aggregation
//
//		1.Count the number of students in each department.
		list.stream().collect(Collectors.groupingBy(s -> s.getId().replaceAll("[0-9]", ""), Collectors.counting()))
				.entrySet().stream().forEach(System.out::println);
//		// 2. Students in each city
		Map<String, Long> cityCount = list.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
		System.out.println("City count : \n" + cityCount);
		// 3. Average age in each department
		System.out.println(" Average age of each department ");
		System.out.println(list.stream().collect(Collectors.groupingBy(s -> s.getId().replaceAll("[0-9]", ""),
				Collectors.averagingInt(Student::getAge))));
		// 4. Average rank by gender
		System.out.println(" Average Rank of each Gender ");
		Map<String, Double> avgRankGender = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank)));
		System.out.println(avgRankGender);
		// 5. Total number of students

		long total = list.stream().count();
		System.out.println(" Total studnets :" + total);
		// 6. Department with highest average rank
		list.stream()
				.collect(Collectors.groupingBy(s -> s.getId().replaceAll("[0-9]", ""),
						Collectors.averagingInt(Student::getRank)))
				.entrySet().stream().min(Map.Entry.comparingByValue()).ifPresent(System.out::println);
//
//		*** Min / Max / Ranking Problems
//
//		1.Find the student with the best (lowest) rank.
		System.out.println(" Lowest rank ");
		list.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(1).forEach(System.out::println);
//		2.Find the student with the worst (highest) rank.
		System.out.println(" Worst rank ");
		list.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).limit(1)
				.forEach(System.out::println);
//		3.Find the second best rank holder.
		System.out.println(" Second best rank ");
		list.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst()
				.ifPresent(System.out::println);
//		4.Find the third best rank holder.
		System.out.println(" Third best rank ");
		list.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(2).findFirst()
				.ifPresent(System.out::println);
//		5.Find the youngest student.
		list.stream().min(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);
//		6.Find the oldest student.
		list.stream().max(Comparator.comparingInt(Student::getAge)).ifPresent(System.out::println);

//		**** FlatMap & Collections
//
//		1.Print all contact numbers of all students.
		list.stream().flatMap(s -> s.getContacts().stream()).forEach(System.out::println);
//		2.Count the total number of contact numbers.
		System.out.println(list.stream().flatMap(s -> s.getContacts().stream()).count());
		// 3. Students who have more than one contact number
		list.stream().filter(s -> s.getContacts().size() > 1).forEach(System.out::println);

		// 4. Unique contact numbers
		list.stream().flatMap(s -> s.getContacts().stream()).distinct().forEach(System.out::println);
//
//		*** Conditional & Matching
//
//		1.Check if any student belongs to Biotech Engineering.
		System.out.println(" any student belongs to biotech ?");
		System.out.println(list.stream().anyMatch(S -> S.getId().startsWith("B")));
//		2.Check if all students are above age 20
		System.out.println(" Are all above 20 ");
		System.out.println(list.stream().allMatch(s -> s.getAge() > 20));
//		3.Check if no student belongs to Civil Engineering.
		System.out.println(" any student belongs to Civil ?");
		System.out.println(list.stream().anyMatch(S -> S.getId().startsWith("CI")));

//		*** Gender-Based Analysis
//
//		1.Count male and female students.
		Map<String, Long> genderCount = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println(genderCount);
//		2.Find the average age of male students.
		System.out.println(list.stream().filter(s -> s.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.averagingDouble(Student::getAge)));
//		3.Find the average age of female students.
		System.out.println(list.stream().filter(s -> s.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.averagingDouble(Student::getAge)));
//		4.Find the highest ranked male student.
		list.stream().filter(s -> s.getGender().equals("Male")).min(Comparator.comparingInt(Student::getRank))
				.ifPresent(System.out::println);
//		5.Find the highest ranked female student.
		System.out.println(list.stream().filter(s -> s.getGender().equalsIgnoreCase("female"))
				.min(Comparator.comparingInt(Student::getRank)).get());

//		*** Department-Specific Queries
//
//		1.List students department-wise with names only.
		list.stream().map(Student::getName).toList().forEach(System.out::println);
		System.out.println(list.stream().collect(Collectors.groupingBy(s -> s.getId().replaceAll("[0-9]", ""),
				Collectors.mapping(Student::getName, Collectors.toList()))));
		// Map<String, List<String>> deptNames =
		// list.stream().collect(Collectors.groupingBy(s ->
		// s.getId().replaceAll("[0-9]", ""), Collectors.mapping(Student::getName,
		// Collectors.toList())));
//		2.Find the youngest student in Computer Engineering.
		list.stream().filter(s -> s.getId().startsWith("C")).min(Comparator.comparingInt(Student::getAge))
				.ifPresent(System.out::println);
		;
//		3.Find the top-ranked student in Mechanical Engineering.
		list.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst()
				.ifPresent(System.out::println);
//		4.Count students in Electronics Engineering from Karnataka.
		System.out.println(list.stream().filter(s -> s.getId().startsWith("E")).count());

//		*** Advanced Level
//
//		1.Convert the student list into a Map<Id, Name>
		Map<String, String> idToName = list.stream().collect(Collectors.toMap(Student::getId, Student::getName));
//		2.Convert the student list into a Map<Department, List<Student>>.
		Map<String, List<Student>> studentsByDept = list.stream()
				.collect(Collectors.groupingBy(s -> s.getId().replaceAll("[0-9]", "")));

		// Printing the result
		studentsByDept.forEach((dept, studentList) -> {
			System.out.println("Department: " + dept + " | Students: " + studentList.size());
		});
//		3.Find students whose name starts with ‘S’.
		System.out.println("Students starting with 'S':");
		list.stream().filter(s -> s.getName().startsWith("S")).forEach(System.out::println);
//		4.Find students whose name length is greater than 5.
		System.out.println("Students with names longer than 5 characters:");
		list.stream().filter(s -> s.getName().length() > 5)
				.forEach(s -> System.out.println(s.getName() + " (" + s.getName().length() + ")"));
//		5.Find students whose rank is even.
		System.out.println(" Even rank");
		list.stream().filter(s -> s.getRank() % 2 == 0).forEach(System.out::println);
//		6.Find students whose rank is odd.
		System.out.println("Odd rank");
		list.stream().filter(s -> s.getRank() % 2 != 0).forEach(System.out::println);

//		*** Bonus Challenges
//
//		1.Find the top 3 youngest students.
		System.out.println(" top 3 youngest  ");
		list.stream().sorted(Comparator.comparingInt(Student::getAge)).limit(3).forEach(System.out::println);
//		2.Find the top 3 oldest students.
		System.out.println(" top 3 Oldest  ");
		list.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).limit(3).forEach(System.out::println);
//		3.Partition students based on age > 25.
		Map<Boolean, List<Student>> partitionedAge = list.stream()
				.collect(Collectors.partitioningBy(s -> s.getAge() > 25));
//		4.Partition students based on rank < 100.
		System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x.getRank() < 100)));
//		5.Find the city having maximum students.
		list.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting())) // Group & Count
				.entrySet().stream() // Stream the Map
				.max(Map.Entry.comparingByValue()) // Find max count
				.ifPresent(entry -> System.out
						.println("City with most students: " + entry.getKey() + " (" + entry.getValue() + ")"));
//		6.Find the department having minimum students.
		list.stream().collect(Collectors.groupingBy(s -> s.getId().replaceAll("[0-9]", ""), // Extract Dept (e.g., "CS")
				Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByValue()) // Find min count
				.ifPresent(entry -> System.out
						.println("Dept with fewest students: " + entry.getKey() + " (" + entry.getValue() + ")"));
	}
}
