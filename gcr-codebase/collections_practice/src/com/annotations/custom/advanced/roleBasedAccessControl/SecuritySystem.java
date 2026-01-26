package com.annotations.custom.advanced.roleBasedAccessControl;

import java.lang.reflect.Method;

public class SecuritySystem {
	public static void main(String[] args) throws Exception {
		String currentUserRole = "USER"; // Try changing this to "ADMIN"
		AdminPanel panel = new AdminPanel();

		invokeSecurely(panel, "deleteUser", currentUserRole);
		invokeSecurely(panel, "viewDashboard", currentUserRole);
	}

	public static void invokeSecurely(Object obj, String methodName, String role) throws Exception {
		Method m = obj.getClass().getMethod(methodName);

		if (m.isAnnotationPresent(RoleAllowed.class)) {
			String requiredRole = m.getAnnotation(RoleAllowed.class).value();
			if (!requiredRole.equals(role)) {
				System.out.println(" Access Denied for " + methodName + "! Required: " + requiredRole);
				return;
			}
		}
		m.invoke(obj);
	}
}