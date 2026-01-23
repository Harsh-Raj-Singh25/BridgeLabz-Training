package com.collections.list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].

 */
public class ReverseList {
	
	public static void reverseList(List<Integer> lst) {
		
		int size=lst.size();
		
		for(int i=0;i<size/2;i++) {
			// swap elements at index i and i-1
			Integer temp=lst.get(i);
			lst.set(i, lst.get(size-i-1));
			lst.set(size-i-1, temp);
			
		}
		System.out.println(" Manually reversed list :"+lst);
		
	}
	
	public static void main(String[] args) {
		// array list
		List <Integer> array=new ArrayList<>();
		array.add(4);
		array.add(5);
		array.addFirst(3);
		array.add(6);
		array.add(7);
		System.out.println(" Original ArrayList :"+ array);
		reverseList(array);
		
		// Linked List
		List <Integer> ll=new LinkedList<>();
		for(int i=1;i<6;i++) {
			ll.add(i);
		}
		System.out.println(" Original Linked List:"+ ll);
		reverseList(ll);
		
		
	}
	
}
