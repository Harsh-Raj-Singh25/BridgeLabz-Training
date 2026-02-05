package com.multithreading.practice;

public class Thread1 extends Thread {
	
	//overloading the constructor
	public Thread1(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		for(int i=0 ;i<5;i++) {
			System.out.println("inside "+ Thread.currentThread() +" " + i);	
		}	
	}
	
	
	
//	@Override
//	public void run() {
//		for(int i=0 ;i<5;i++) {
//			System.out.println("inside thread1 "+ i);
//			
//		}	
//	}
	
}
