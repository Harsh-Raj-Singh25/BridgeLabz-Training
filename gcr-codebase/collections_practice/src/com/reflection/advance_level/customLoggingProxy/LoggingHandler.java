package com.reflection.advance_level.customLoggingProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingHandler implements InvocationHandler {
	private final Object target;

	public LoggingHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(" [LOG]: Calling method " + method.getName());
		return method.invoke(target, args);
	}
}