package com.reflection.advance_level.customLoggingProxy;

class GreetingImpl implements Greeting {
	public void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
}
