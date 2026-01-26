package com.reflection.advance_level.customLoggingProxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		Greeting realObject = new GreetingImpl();
		Greeting proxy = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
				new Class[] { Greeting.class }, new LoggingHandler(realObject));

		proxy.sayHello("User"); // This triggers the LoggingHandler
	}
}
