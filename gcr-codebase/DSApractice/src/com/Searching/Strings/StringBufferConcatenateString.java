package com.Searching.Strings;

import java.util.Scanner;

public class StringBufferConcatenateString {
	public static String concatenateStrings(String [] array) {
		StringBuffer sb=new StringBuffer();
		for(String s: array) {
			sb.append(s);
		}
		return sb.toString();
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String [] array= {"Harsh ","Raj ","Singh ","Chandel"};
		System.out.print("The concatenated String is :"+concatenateStrings(array));
	}
}
