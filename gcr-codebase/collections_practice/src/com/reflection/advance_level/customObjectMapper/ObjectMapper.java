package com.reflection.advance_level.customObjectMapper;
import java.lang.reflect.Field;
import java.util.*;
import java.util.HashMap;

public class ObjectMapper {
	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
		// Create a new instance using the default constructor
		T instance = clazz.getDeclaredConstructor().newInstance();

		for (Map.Entry<String, Object> entry : properties.entrySet()) {
			try {
				//  Find the field matching the map key
				Field field = clazz.getDeclaredField(entry.getKey());
				field.setAccessible(true);
				//   Set the value from the map into the object field
				field.set(instance, entry.getValue());
			} catch (NoSuchFieldException e) {
				System.out.println(" Warning: No field '" + entry.getKey() + "' in class " + clazz.getSimpleName());
			}
		}
		return instance;
	}

	public static void main(String[] args) throws Exception {
		Map <String, Object> data = new HashMap<>();
		data.put("id", 101);
		data.put("name", "Gemini");

		User user = toObject(User.class, data);
		System.out.println("Mapped User: " + user.name + " (ID: " + user.id + ")");
	}
}
