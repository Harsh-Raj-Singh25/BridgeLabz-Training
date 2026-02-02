package com.functional_interface.static_methods.unitConversionTool;

interface LogisticsConverter {
	double KG_TO_LBS = 2.20462;
	double KM_TO_MILES = 0.621371;

	static double toLbs(double kg) {
		return kg * KG_TO_LBS;
	}

	static double toMiles(double km) {
		return km * KM_TO_MILES;
	}
}

