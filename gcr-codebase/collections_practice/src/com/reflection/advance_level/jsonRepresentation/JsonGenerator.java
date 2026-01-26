package com.reflection.advance_level.jsonRepresentation;

import java.lang.reflect.Field;

public class JsonGenerator {
	public static String stringify(Object obj) throws Exception {
		StringBuilder sb = new StringBuilder("{");
		Field[] fields = obj.getClass().getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			sb.append("\"").append(fields[i].getName()).append("\": ");

			Object value = fields[i].get(obj);
			if (value instanceof String)
				sb.append("\"").append(value).append("\"");
			else
				sb.append(value);

			if (i < fields.length - 1)
				sb.append(", ");
		}
		return sb.append("}").toString();
	}
}