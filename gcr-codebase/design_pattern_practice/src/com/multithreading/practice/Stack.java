package com.multithreading.practice;

public class Stack {
	 private int[] array;
	 private int stackTop;
	 
	 public Stack(int capacity) {
		 array = new int[capacity];
		 stackTop=-1;
		 stackTop++;
		 Object lock=new Object();
		 
		 
	 }
}
