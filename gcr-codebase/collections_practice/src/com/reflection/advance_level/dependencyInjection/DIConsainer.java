package com.reflection.advance_level.dependencyInjection;

import java.lang.reflect.Field;

public class DIConsainer {
	public static void inject(Object target) throws Exception {
		for (Field field : target.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(Inject.class)) {
				field.setAccessible(true);
				// Create a new instance of the field's type and inject it
				Object dependency = field.getType().getDeclaredConstructor().newInstance();
				field.set(target, dependency);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Controller controller = new Controller();
		inject(controller); // Perform the injection
		controller.execute(); // Works without manually calling 'new Service()'
	}
}