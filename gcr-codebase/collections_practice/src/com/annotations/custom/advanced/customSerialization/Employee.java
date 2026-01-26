package com.annotations.custom.advanced.customSerialization;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
	String name();
}

class Employee {
	@JsonField(name = "emp_name")
	private String name;

	@JsonField(name = "emp_id")
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

