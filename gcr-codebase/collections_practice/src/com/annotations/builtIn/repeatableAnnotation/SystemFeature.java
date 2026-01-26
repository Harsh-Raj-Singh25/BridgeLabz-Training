package com.annotations.builtIn.repeatableAnnotation;

import java.lang.annotation.*;

// The Container Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
	BugReport[] value();
}

// The Repeatable Annotation
@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@interface BugReport {
	String description();
}

class SystemFeature {
	// Apply it multiple times
	@BugReport(description = "UI layout is broken on mobile")
	@BugReport(description = "Button doesn't click on Safari")
	public void renderDashboard() {
		System.out.println("Rendering Dashboard...");
	}
}
