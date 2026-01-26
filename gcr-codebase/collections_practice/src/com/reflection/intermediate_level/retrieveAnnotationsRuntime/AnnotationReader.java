package com.reflection.intermediate_level.retrieveAnnotationsRuntime;

public class AnnotationReader {
	public static void main(String[] args) {
		Class<ScriptGenerator> clazz = ScriptGenerator.class;

		// Check and Retrieve
		if (clazz.isAnnotationPresent(Author.class)) {
			Author author = clazz.getAnnotation(Author.class);
			System.out.println(" Class Author: " + author.name());
		}
	}
}