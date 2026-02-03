package com.employeeManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		List <Employee> list=new ArrayList<>();
		
		list.add(new Employee("e-1","Harsh",21,"M","Developer",LocalDate.of(2026, 2, 3),74000));
		list.add(new Employee("e-2","Harsh V",22,"M","HR",LocalDate.of(2027, 11, 30),70000));
		list.add(new Employee("e-3","Ayushman",20,"M","DevOps",LocalDate.of(2030, 2, 3),55000));
		list.add(new Employee("e-4","Namrata",23,"F","Development",LocalDate.of(2026, 1, 3),85000));
		list.add(new Employee("e-5","Anil",25,"M","HR",LocalDate.of(2020, 5, 4),47000));
		list.add(new Employee("e-4","Anjan",30,"M","Development",LocalDate.of(2014, 1, 3),75000));
		
	
//		1. How many male and female employees are there in the organization ?
		System.out.print("Male employees : ");
		System.out.println(list.stream().filter(Employee -> Employee.getGender().equalsIgnoreCase("m")).collect(Collectors.counting()));
		System.out.print("Female employees : ");
		System.out.println(list.stream().filter(Employee -> Employee.getGender().equalsIgnoreCase("f")).collect(Collectors.counting()));
//		list.stream().filter(Employee -> Employee.getGender().equalsIgnoreCase("m")).forEach(System.out::println);
		
//		2. Print the name of all departments in the organization ?
		list.stream().collect(Collectors.groupingBy(x -> x.department)).forEach((dept,Employee) -> System.out.println(dept));
		// or
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		3. What is the average age of male and female employees ?
		System.out.println(list.stream().collect(Collectors.averagingInt(Employee::getAge)));
		
//		4. Get the details of highest paid employee in the organization ?
		IntSummaryStatistics stats=list.stream().collect(Collectors.summarizingInt(Employee:: getSalary));
		System.out.println(" Employee with highest salary :"+ stats.getMax());
		list.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
		
//		5. Get the names of all employees who have joined after 2015 ?
		System.out.println("names of all employees who have joined after 2015 : ");
		list.stream().filter(e -> e.getJoiningDate().getYear() > 2015).map(Employee:: getName).forEach(System.out::println);
		
//		6. Count the number of employees in each department ?
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.counting())));
		
//		7. What is the average salary of each department ?
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.averagingInt(Employee::getSalary))));
		
//		8. Get the details of youngest male employee in the product development department ?
		list.stream().filter(e -> e.getGender().equalsIgnoreCase("M") && e.getDepartment().equalsIgnoreCase("Development"))
	    .min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);
		
//		9. Who has the most working experience in the organization?
		System.out.println(" Most experienced Employee :");
		list.stream().min(Comparator.comparing(Employee :: getJoiningDate)).ifPresent(System.out::println);
		
//		10. How many male and female employees are there in the Sales team?
		System.out.print("Male employees in sales: ");
		System.out.println(list.stream().filter(Employee -> Employee.getGender().equalsIgnoreCase("m") &&  Employee.getDepartment().equalsIgnoreCase("sales")).collect(Collectors.counting()));
		System.out.print("Female employees in sales : ");
		System.out.println(list.stream().filter(Employee -> Employee.getGender().equalsIgnoreCase("f") &&  Employee.getDepartment().equalsIgnoreCase("sales")).collect(Collectors.counting()));
		
//		11. What is the average salary of male and female employees ?
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee :: getGender , Collectors.averagingInt(Employee::getSalary))));
		
//		12. List down the names of all employees in each department ?
		System.out.println("List down the names of all employees in each department  :");
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.mapping(Employee::getName, Collectors.toList()))));
		// alternate
		Map<String ,String> map=list.stream().collect(Collectors.toMap(
			    Employee::getDepartment, 
			    Employee::getName, 
			    (existing, replacement) -> existing + ", " + replacement // Merge Function
			));
		System.out.println(map);
		list.stream().collect(Collectors.toMap(
			    Employee::getDepartment, 
			    Employee::getName, 
			    (existing, replacement) -> existing + ", " + replacement // Merge Function
			)).forEach((dept, names) -> System.out.println(dept + ": " + names));
		
//		13. What is the average salary and total salary of the whole organization?
		//list.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.mapping(Collectors.averagingDouble(Employee:: getSalary), Collectors.summingDouble(Employee::getSalary) )));
		System.out.println("Average salary :"+stats.getAverage() + " | Total salary :"+ stats.getSum());
		
//		14. Get the employee whose salary are more than 25k.
		System.out.println("employee whose salary are more than 25k");
		list.stream().filter(x-> x.getSalary()>25000).toList().forEach(System.out::println);;
		
//		15.Who is the highest paid employee in the organization?
		System.out.println(" Highest paid Employee :");
		list.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
		
//		16.Who is the second highest paid employee in the organization?
		System.out.println("Second highest paid employee : ");
		list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);
		
//		17.Who is the third highest paid employee in the organization?
		System.out.println("Third highest paid employee : ");
		list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary).reversed()).skip(2).findFirst().ifPresent(System.out::println);
		// alternate :
		System.out.println(list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary).reversed()).skip(2).findFirst().get());
		
//		18.Who is the lowest paid employee in the organization?
		System.out.println(" Lowest paid Employee :");
		list.stream().min(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
		
//		19.Who is the second lowest paid employee in the organization?
		System.out.println("Second lowest paid employee : ");
		list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary)).skip(1).findFirst().ifPresent(System.out::println);
		
//		20.Get the first five lowest paid employee in the organization?
		System.out.println("first five lowest paid employee in the organization : ");
		list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary)).limit(5).forEach(System.out::println);
		
//		21.Get the first five highest paid employee in the organization?
		System.out.println("first five Highest paid employee in the organization : ");
		list.stream().sorted(Comparator.comparingDouble(Employee:: getSalary).reversed()).limit(5).forEach(System.out::println);
	}
}

