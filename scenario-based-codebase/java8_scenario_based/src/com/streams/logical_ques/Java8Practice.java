package com.streams.logical_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Practice {
	public static void main(String[] args) {
		
//		Java 8 Logical Questions
//
//		1. Count vowels in a string using Stream
//		Input: "programming"
//		Output: 3
		String str="programming";
		long count=str.chars().filter(s -> "aeiou".indexOf(s)!=-1).count();
		System.out.println(count);
//
//		2. Count number of words in a sentence
//		Input: "Java is very powerful"
//		Output: 4
		String sent="Java is very powerful";
		long count1=Arrays.stream(sent.split("\\s+")).count();
		System.out.println(count1);
//
//		3. Find even numbers from list
//		Input: [2,5,7,8,10,13]
//		Output: [2,8,10]
		int [] array= {2,5,7,8,10,13};
		List<Integer> list=Arrays.stream(array).filter(n-> n%2==0).boxed().collect(Collectors.toList());
		System.out.println(list);
		
//		4. Convert list of strings to uppercase
//		Input: ["java","spring","boot"]
//		Output: ["JAVA","SPRING","BOOT"]
		List<String> list1=Arrays.asList("java","spring","boot");
		List<String> res=list1.stream().map(s-> s.toUpperCase()).toList();
		System.out.println(res);
		
//		5. Find string length list
//		Input: ["cat","elephant","dog"]
//		Output: [3,8,3]
		List<String> inp=Arrays.asList("cat","elephant","dog");
		inp.stream().map(l-> l.length()).toList().forEach(System.out::println);
//		6. Count strings starting with ‘a’
//		Input: ["apple","banana","ant","car"]
//		Output: 2
		List<String> input=Arrays.asList("apple","banana","ant","car");
		long countA=input.stream().filter(s-> s.startsWith("a")).count();
		System.out.println(countA);
		
//		7. Remove empty strings
//		Input: ["java","","spring","","boot"]
//		Output: ["java","spring","boot"]
		List<String> input1=Arrays.asList("java","","spring","","boot");
		List<String> res1=input1.stream().filter(s-> s.length()>1).toList();
		System.out.println(res1);
		
//		8. Sum of all numbers using stream
//		Input: [1,2,3,4,5]
//		Output: 15
		List<Integer> num=Arrays.asList(1,2,3,4,5);
		System.out.println(num.stream().mapToInt(Integer::intValue).sum());
		
//		9. Find max number
//		Input: [10,25,3,99,45]
//		Output: 99
		System.out.println(list.stream().max(Integer::compare));
		
//		10. Reverse each string in list
//		Input: ["java","api"]
//		Output: ["avaj","ipa"]
		List<String> list3=Arrays.asList("java","api");
		List<String> reversed = list3.stream()
			    .map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		System.out.println(reversed);
		
//		11. Remove duplicate elements from list
//		Input: [1,2,2,3,4,4,5]
//		Output: [1,2,3,4,5]
		List <Integer> numbers=Arrays.asList(1,2,2,3,4,4,5);
		System.out.println(numbers.stream().distinct().toList());
		
//		12. Sort list in descending order
//		Input: [5,1,9,3]
//		Output: [9,5,3,1]
		List <Integer> number=Arrays.asList(5,1,9,3);
		System.out.println(number.stream().sorted(Comparator.reverseOrder()).toList());
//		13. Find second highest number
//		Input: [10,40,30,20]
//		Output: 30
		List <Integer> number1=Arrays.asList(10,40,30,20);
		System.out.println(number1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
//		14. Join strings with comma
//		Input: ["Java","Spring","Boot"]
//		Output: "Java,Spring,Boot"
		
		List<String> strings=Arrays.asList("Java","Spring","Boot");
		System.out.println(strings.stream().collect(Collectors.joining(",")));
		
//		15. Frequency of each character
//		Input: "banana"
//		Output: {b=1, a=3, n=2}
		String s="banana";
		System.out.println( s.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) );
//		16. Find numbers greater than 50
//		Input: [10,55,60,23,90]
//		Output: [55,60,90]
		List <Integer> numbers1=Arrays.asList(10,55,60,23,90);
		System.out.println(numbers1.stream().filter(n-> n>50).toList());
		
		
//		17. Group strings by length
//		Input: ["a","bb","ccc","dd"]
//		Output: {1=[a], 2=[bb,dd], 3=[ccc]}
		List <String> strs=Arrays.asList("a","bb","ccc","dd");
		System.out.println(strs.stream().collect(Collectors.groupingBy(String:: length)));
		
//		18. Find first non-repeated character
//		Input: "stress"
//		Output: t
		String in="stress";
//		Char first=in.chars().mapToObj(Char::Char).collect(null, null, null)
//		19. Convert List<Integer> to List<String>
//		Input: [1,2,3]
//		Output: ["1","2","3"]
		List <Integer> ints=Arrays.asList(1,2,3);
		System.out.println(ints.stream().map(String:: valueOf).toList());
//		20. Count occurrences of each word
//		Input: "java is java and java is fast"
//		Output: {java=3, is=2, and=1, fast=1}
		String input2="java is java and java is fast";
		Map<String, Long> wordCount = Arrays.stream(input2.split("\\s+"))
			    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
//		21. Partition numbers into even and odd
//		Input: [1,2,3,4,5,6]
//		Output: {even=[2,4,6], odd=[1,3,5]}
		System.out.println(num.stream().collect(Collectors.partitioningBy(n-> n%2==0)));
//
//		22. Find duplicate elements only
//		Input: [1,2,3,2,4,5,1]
//		Output: [1,2]
		List <Integer> integers=Arrays.asList(1,2,3,2,4,5,1);
		Set<Integer> items = new HashSet<>();
		System.out.println(integers.stream().filter(n -> !items.add(n)).toList());
//
//		23. Find longest string
//		Input: ["java","microservices","api"]
//		Output: "microservices"
		List<String> list4=Arrays.asList("java","microservices","api");
		System.out.println(list4.stream().max(Comparator.comparing(String::length)).get());
//
//		24. Find top 3 highest numbers
//		Input: [10,90,30,70,50]
//		Output: [90,70,50]
		List <Integer> integers1=Arrays.asList(10,90,30,70,50);
		System.out.println(integers1.stream().sorted(Comparator.reverseOrder()).limit(3).toList());
//
//		25. Flatten list of lists
//		Input: [[1,2],[3,4],[5]]
//		Output: [1,2,3,4,5]
//		List <Integer> listoflist=Arrays.asList((1,2),(3,4),(5));
		
//		26. Find sum of squares of even numbers
//		Input: [1,2,3,4,5]
//		Output: 20 (2² + 4²)
		System.out.println(num.stream().filter(n-> n%2==0).map(n-> n*n).mapToInt(Integer::intValue).sum());
//		27. Sort map by value
//		Input: {A=3, B=1, C=2}
//		Output: {B=1, C=2, A=3}
//
//		28. Find employee with highest salary (using stream)
//		Input: List of Employees
//		Output: Employee object with max salary
//
//		29. Find common elements between two lists
//		Input: [1,2,3,4] and [3,4,5,6]
//		Output: [3,4]
//
//		30. Find kth smallest element
//		Input: [9,1,5,3,7], k=2
//		Output: 3
	}
}
