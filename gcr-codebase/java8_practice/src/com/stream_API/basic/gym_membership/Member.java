package com.stream_API.basic.gym_membership;

import java.time.LocalDate;

public class Member {
	String name;
	LocalDate expiry;
	
	Member(String name, LocalDate date){
		this.name=name;
		this.expiry=date;
	}
	public String getName() {
		return name;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
}
