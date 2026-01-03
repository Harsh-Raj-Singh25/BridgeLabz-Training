package SmartHomeAutomationSystem;

//INHERITANCE: AC specializing Appliance
class AirConditioner extends Appliance implements Controllable {
	private int temperature;

	public AirConditioner(String room, int temp) {
		super(room);
		this.temperature = temp;
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		// POLYMORPHISM: Complex behavior unique to AC
		System.out.println( getRoomName() + " AC: ON (Target: " + temperature + "°C)");
		System.out.println("   [Cooling started..........]");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println( getRoomName() + " AC: OFF");
	}

	@Override
	public double getEnergyConsumption() {
		return 1500.0;
	} // High energy
}