package com.stream_API.forEach_questions;

import java.util.Arrays;
import java.util.List;

public class WelcomeMessage {
	public static void main(String[] args) {
		List <String> names=Arrays.asList("Harsh","Namrata","Anand","Raj");
		// using forEach to print individual welcome message
		names.stream().forEach(s-> System.out.println("Welcome to the club "+s));
	}
}
