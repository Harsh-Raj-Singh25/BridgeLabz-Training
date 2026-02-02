package com.stream_API.basic.gym_membership;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ExpiryChecker {
	public static void main(String[] args) {
		List<Member> members=Arrays.asList(
				new Member("Harsh",LocalDate.now().plusDays(10)),
				new Member("Namrata",LocalDate.now().plusDays(15)),
				new Member("Anand",LocalDate.now().plusDays(60)),
				new Member("Sharma",LocalDate.now().plusDays(35)),
				new Member("di",LocalDate.now().plusDays(25)),
				new Member("Ramesh",LocalDate.now().plusDays(2)),
				new Member("Utkarsh",LocalDate.now().plusDays(14)),
				new Member("Ajay",LocalDate.now().plusDays(45))
				);
		LocalDate expiryDate=LocalDate.now().plusDays(30);
		members.stream().filter(d -> d.expiry.isBefore(expiryDate)).toList()
		.forEach(m -> System.out.println(m.name + " | Pay before :"+m.expiry));
				
	}
}
