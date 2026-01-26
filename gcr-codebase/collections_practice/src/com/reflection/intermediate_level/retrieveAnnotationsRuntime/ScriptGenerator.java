package com.reflection.intermediate_level.retrieveAnnotationsRuntime;

import java.lang.annotation.*;

// Define the Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Applied to classes
@interface Author {
	String name();
}

// Apply it to a class
@Author(name = "Gemini AI")
class ScriptGenerator {
}
