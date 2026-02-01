package com.lambda_expressions.notificationFiltering;
/*
 * Notification Filtering
○ Scenario: A hospital app sends patient alerts. Based on user preference, only
certain alerts should be shown.
○ Task: Use lambdas with Predicate to filter alerts.
 */
public class Alert {
	String message;
	String priority;
	String department;
	
	Alert(String message, String priority, String department){
		this.message=message;
		this.priority=priority;
		this.department=department;
	}
	
	
}
