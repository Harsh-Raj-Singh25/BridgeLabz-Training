package com.functional_interface.static_methods.passwordValidator;

public interface SecurityUtils {
	static boolean checkPassword(String pass) {
		// using regex to validate password 
		return pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,32}$");
	}
}
