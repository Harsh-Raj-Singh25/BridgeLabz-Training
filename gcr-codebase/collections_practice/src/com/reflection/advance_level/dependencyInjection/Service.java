package com.reflection.advance_level.dependencyInjection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class Service {
	public void run() {
		System.out.println("Service running...");
	}
}

