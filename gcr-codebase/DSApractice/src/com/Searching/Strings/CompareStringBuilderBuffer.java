package com.Searching.Strings;

public class CompareStringBuilderBuffer {
	public static void main(String[] args) {
		long startTime, endTime;
		StringBuilder sb=new StringBuilder();
		StringBuffer sf=new StringBuffer();
		
		// testing STringBuilder
		startTime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			sb.append("hello");
			
		}
		endTime=System.nanoTime();
		System.out.println("StringBuilder Time Performance :"+(endTime-startTime)+"ns");
		
		// testing StringBuffer
		startTime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			sf.append("hello");
			
		}
		endTime=System.nanoTime();
		System.out.println("StringBuffer Time Performance :"+(endTime-startTime)+"ns");
		
	}
}
