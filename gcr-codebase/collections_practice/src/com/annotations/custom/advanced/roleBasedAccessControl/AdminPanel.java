package com.annotations.custom.advanced.roleBasedAccessControl;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
	String value();
}

class AdminPanel {
	@RoleAllowed("ADMIN")
	public void deleteUser() {
		System.out.println(" User deleted successfully.");
	}

	public void viewDashboard() {
		System.out.println("Dashboard visible to everyone.");
	}
}

