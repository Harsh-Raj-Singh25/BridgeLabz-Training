package com.functional_interface.marker_interfaces.data_serialization;

import java.io.*;

//Tagging the class with Serializable marker interface
class PatientRecord implements Serializable {
	private String name;
	private int age;

	public PatientRecord(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient: " + name + ", Age: " + age;
	}
}
