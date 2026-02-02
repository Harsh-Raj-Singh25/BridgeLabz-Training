package com.functional_interface.functional_interfaces.stringLengthChecker;

import java.util.function.Function;

//import sun.jvm.hotspot.tools.SysPropsDumper;

public class Checker {
	public static void main(String[] args) {
		int limit=6;
		Function<String,Integer> getLength=s -> s.length();
		
		System.out.println(getLength.apply("Harsh"));
		
		String s="Harsh Raj Singh";
		int currLength=getLength.apply(s);
		
		if(currLength>limit) {
			System.out.println("Your name out of limit");
		}else {
			System.out.println("Great !! you can proceed");
		}
	}
}
