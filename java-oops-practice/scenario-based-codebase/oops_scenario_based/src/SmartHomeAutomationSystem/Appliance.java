package SmartHomeAutomationSystem;

//BASE CLASS: Represents a general home appliance
abstract class Appliance {
	private String roomName;
	private boolean powerStatus; // ENCAPSULATION: State is private

	// CONSTRUCTOR: Sets default room and power state
	public Appliance(String roomName) {
		this.roomName = roomName;
		this.powerStatus = false;
	}

	// ENCAPSULATION: Getters and Setters
	public String getRoomName() {
		return roomName;
	}

	public boolean isOn() {
		return powerStatus;
	}

	protected void setPowerStatus(boolean status) {
		this.powerStatus = status;
	}
}