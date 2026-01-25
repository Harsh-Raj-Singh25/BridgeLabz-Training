package homeNest;

abstract class Device {
	public final String deviceId; // permanent id
	private String status; // encapsulated
	protected double energyUsage; // for subclasses access
	private StringBuilder firmwarelogs=new StringBuilder();
	
	Device(String id, String status, double usage){
		this.deviceId=id;
		this.status=status;
		this.energyUsage=usage;
		logAction("Device registered with user.");
	}
	
	public String getStatus() {
		return status;
	}
	// Internal method to update status (Encapsulation)
    protected void setStatus(String newStatus) {
        this.status = newStatus;
        logAction("Status changed to " + newStatus);
    }

    // Access modifier to secure logs
    protected void logAction(String action) {
        firmwarelogs.append(System.currentTimeMillis()).append(": ").append(action).append("\n");
    }
	
}
