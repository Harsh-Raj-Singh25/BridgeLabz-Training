package parkEase;

//ENCAPSULATION: Managing the Parking Space
class ParkingSlot {
	private String slotId;
	private String vehicleTypeAllowed;
	private boolean isOccupied; // Private to prevent external tampering

	public ParkingSlot(String slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}

	public String getSlotId() {
		return slotId;
	}

	public String getVehicleTypeAllowed() {
		return vehicleTypeAllowed;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	// ENCAPSULATION: Status only modifiable through controlled methods
	public void occupy() {
		this.isOccupied = true;
	}

	public void vacate() {
		this.isOccupied = false;
	}
}
