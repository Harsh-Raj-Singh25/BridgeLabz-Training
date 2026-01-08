package com.Searching.Strings;

import java.util.Scanner;

public class StringBuilderReverseString {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string :");
		String s=sc.next();
		
		sb.append(s); // appending the input string in the created StringBuilder
		sb.reverse(); // reversing the stringBuilder
		
		sb.toString(); // converting the StringBuilder back to String.
		System.out.println(sb);
		
	}
}
