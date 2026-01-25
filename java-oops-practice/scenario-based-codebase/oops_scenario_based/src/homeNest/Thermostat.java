package homeNest;

public class Thermostat extends Device implements IControllable {
	Thermostat(String id, String status, double usage){
		super(id, status, usage);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if(getStatus().equalsIgnoreCase("off")) {
			setStatus("ON");
			System.out.println("Thermostat turned on");
		}else {
			System.out.println(" Thermostat already onn");
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(getStatus().equalsIgnoreCase("off")) {
			System.out.println("Already turned off !!!");
		}else{
			setStatus("off");
			System.out.println(" Thermostat turned Off ");
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.energyUsage = 1.0; // Polymorphism: Thermostat resets to a baseline, not 0
        System.out.println("Thermostat " + deviceId + " recalibrated to baseline.");
	}
}

