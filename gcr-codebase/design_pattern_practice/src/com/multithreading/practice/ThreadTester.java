package com.multithreading.practice;

public class ThreadTester {
	public static void main(String[] args) {
		System.out.println("main is starting ");
		
		Thread thread1 = new Thread1("thread1");
		// setting up a daemon thread
//		thread1.setDaemon(true); // this will let the thread1 terminate once the main thread finishes execution
		
		thread1.start();
//		thread1.run();
		
//		Thread thread2=new Thread(new Thread2(),"thread2");
		// alternate way of declaring a runnable thread
		Thread thread2=new Thread(() ->
		{	
			// we will overide run method here itself. no need for separate class implementation
			for(int i=0;i<5 ; i++) {
				System.out.println(Thread.currentThread()+", "+i);
			}
		}
		,"thread2");
		
		thread2.start();
		
		new Thread().run(); // does nothing beacuse default run() returns null if target null
		
		
		System.out.println("main is exiting ");
	}
}
