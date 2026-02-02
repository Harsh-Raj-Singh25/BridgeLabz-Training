package com.stream_API.basic.InsuranceClaim;

public class Insurance {
	String claimType;
	double amount;
	
	Insurance(String type, double amount){
	
		this.amount=amount;
		this.claimType=type;
	}


	public String getClaimType() {
		return claimType;
	}

	public double getAmount() {
		return amount;
	}
	
}
