package com.annotations.builtIn.deprecated;

public class DeprecatedDemo {
	@SuppressWarnings("deprecation") // This tells the compiler to ignore the warning for this specific line
	public static void main(String[] args) {
		LegacyAPI api = new LegacyAPI();

		// Calling the old feature triggers a compiler warning
		api.oldFeature();

		// Calling the recommended feature
		api.newFeature();
	}
}