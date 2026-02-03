package com.streams.student_data;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String Name;
	String id;
	String firstName;
	int age;
	String gender;
	String city;
	int rank;
	List<String> contacts;
	
	public Student(String name, String id, String firstName, int age, String gender, String city, int rank,List<String> contacts) {
		this.Name=name;
		this.id=id;
		this.firstName=firstName;
		this.age=age;
		this.gender=gender;
		this.city=city;
		this.rank=rank;
		this.contacts = contacts != null ? contacts : new ArrayList<>();
	}

	public String getName() {
		return Name;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public int getRank() {
		return rank;
	}

	
	
	@Override
	public String toString() {
		return " Student [ Name: "+ Name +" | id " + id +" | Age : "+age+" | Gender: "+gender+" |City: " +city+" |Rank: "+rank +" | Contacts : " + contacts + " ]";
	}
	

}
