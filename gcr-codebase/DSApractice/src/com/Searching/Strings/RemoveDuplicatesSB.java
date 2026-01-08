package com.Searching.Strings;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesSB {
	public static String removeDuplicates(String s) {
		StringBuilder sb=new StringBuilder();
		HashSet <Character> seen=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			// check if the character is present in hashSet or not....
			if(!seen.contains(ch)) {
				sb.append(ch);
				seen.add(ch);
			}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=removeDuplicates(s);
		System.out.println(s1);
		
	}
}
