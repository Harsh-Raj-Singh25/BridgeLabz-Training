package com.stream_API.forEach_questions;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	public static void main(String[] args) {
		List <String> emails=Arrays.asList("hrs252@gmail.com",
				"nammu3474@gmail.com","anand18@gmail.com");
		
		emails.forEach(email-> sendEmailNotification(email));
	}

	private static void sendEmailNotification(String email) {
		// TODO Auto-generated method stub
		System.out.println("Congrats !!! you are selected ");
	}
}
