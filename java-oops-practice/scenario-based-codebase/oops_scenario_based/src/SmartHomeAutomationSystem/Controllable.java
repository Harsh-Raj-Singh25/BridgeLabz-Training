package SmartHomeAutomationSystem;

// INTERFACE: Standardizes how every device in the house is controlled
interface Controllable {
	void turnOn();

	void turnOff();

	double getEnergyConsumption(); // To demonstrate Operator comparisons later
}

