package com.annotations.custom.advanced.customSerialization;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class JsonSerializer {
	public static String convertToJson(Object obj) throws Exception {
		List<String> jsonElements = new ArrayList<>();

		for (Field field : obj.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			String fieldName = field.isAnnotationPresent(JsonField.class) ? field.getAnnotation(JsonField.class).name()
					: field.getName();

			Object value = field.get(obj);
			String valueStr = (value instanceof String) ? "\"" + value + "\"" : value.toString();
			jsonElements.add("\"" + fieldName + "\":" + valueStr);
		}

		return "{" + String.join(",", jsonElements) + "}";
	}

	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Harsh", 101);
		System.out.println("Generated JSON: " + convertToJson(emp));
	}
}