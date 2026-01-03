package SmartHomeAutomationSystem;

//INHERITANCE: Light specializing Appliance
class Light extends Appliance implements Controllable {
	private int brightness; // 1 to 100

	public Light(String room, int brightness) {
		super(room);
		this.brightness = brightness;
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println(getRoomName() + " Light: ON (Brightness: " + brightness + "%)");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println(getRoomName() + " Light: OFF");
	}

	@Override
	public double getEnergyConsumption() {
		return 15.5;
	} // Low energy
}