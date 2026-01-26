package com.annotations.custom.intermediate.fieldLevelAnnotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//  Define the Field-level Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
	int value();
}

class User {
	@MaxLength(10)
	private String username;

	public User(String username) throws IllegalAccessException {
		this.username = username;
		validate(); // Trigger validation on object creation
	}

	//  Validation Logic using Reflection
	private void validate() throws IllegalAccessException {
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(MaxLength.class)) {
				field.setAccessible(true); // Needed since field is private

				String val = (String) field.get(this);
				int limit = field.getAnnotation(MaxLength.class).value();

				if (val != null && val.length() > limit) {
					throw new IllegalArgumentException(
							" Validation Failed: Field [" + field.getName() + "] exceeds max length of " + limit);
				}
			}
		}
	}
}

