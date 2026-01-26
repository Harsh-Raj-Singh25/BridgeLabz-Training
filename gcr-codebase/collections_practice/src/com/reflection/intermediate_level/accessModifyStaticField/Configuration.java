package com.reflection.intermediate_level.accessModifyStaticField;

import java.lang.reflect.Field;

class Configuration {
	private static String API_KEY = "DEFAULT_KEY_123";

	public static void showKey() {
		System.out.println("Current API Key: " + API_KEY);
	}
}
