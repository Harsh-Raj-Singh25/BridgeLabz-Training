package com.annotations.builtIn.repeatableAnnotation;
import java.lang.reflect.Method;
import java.lang.reflect.*;

public class RepeatableDemo {
	 public static void main(String[] args) throws Exception {
	     Method m = SystemFeature.class.getMethod("renderDashboard");
	     
	     // Retrieve all instances
	     BugReport[] reports = m.getAnnotationsByType(BugReport.class);
	     for (BugReport report : reports) {
	         System.out.println("Found Bug: " + report.description());
	     }
	 }
	}
