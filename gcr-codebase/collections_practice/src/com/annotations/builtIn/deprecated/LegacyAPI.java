package com.annotations.builtIn.deprecated;

class LegacyAPI {

	//Marking the old method as deprecated
	@Deprecated
	public void oldFeature() {
		System.out.println("Using the old feature... (Warning: This will be removed soon)");
	}

	public void newFeature() {
		System.out.println("Using the new, optimized feature!");
	}
}
