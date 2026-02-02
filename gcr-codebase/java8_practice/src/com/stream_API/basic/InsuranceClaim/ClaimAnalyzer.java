package com.stream_API.basic.InsuranceClaim;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * Insurance Claim Analysis
○ Scenario: Find the average claim amount for each claim type.
○ Task: Use groupingBy() and averagingDouble().
 */
public class ClaimAnalyzer {
	public static void main(String[] args) {
		List<Insurance> list=Arrays.asList(
				new Insurance("Accidental",500000),
				new Insurance("Death",1000000),
				new Insurance("Accident",200000),
				new Insurance("Accident",150000),
				new Insurance("Death",1400000)
				);
				
		Map<String, Double> avgByGroup = list.stream().
		collect(Collectors.groupingBy(Insurance:: getClaimType,
				Collectors.averagingDouble(Insurance::getAmount)
				));
		avgByGroup.forEach((type, avg) -> System.out.println(type + " Average: " + avg));
	}
}
