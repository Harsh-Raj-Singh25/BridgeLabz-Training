package com.reflection.intermediate_level.accessModifyStaticField;

import java.lang.reflect.Field;

public class StaticFieldModifier {
	public static void main(String[] args) throws Exception {
		Configuration.showKey();

		//  Access the static field
		Field field = Configuration.class.getDeclaredField("API_KEY");
		field.setAccessible(true);

		// Modify: Use 'null' as the instance for static fields
		field.set(null, "NEW_SECRET_KEY_2026");

		System.out.println(" Static field modified via Reflection.");
		Configuration.showKey();
	}
}