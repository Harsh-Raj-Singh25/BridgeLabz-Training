package homeNest;

public class HomeNestApp {
	public static void main(String[] args) {
		IControllable [] smartHome= {
				new Light("L-1","on",4.5),
				new Lock("Lk-1","off",1.2),
				new Thermostat("T-1","off",5.9)
		};
		
		double totalUsage=0;
		
		System.out.println("=======================");
		System.out.println("WELCOME TO  SMARTHOME");
		System.out.println("-----------------------");
		for(IControllable d: smartHome) {
			d.turnOn();
			d.reset();
			
			// Note: To get energy, we'd need to cast back to Device
			if(d instanceof Device) {
				totalUsage+= ((Device ) d).energyUsage;
			}
			System.out.println("--------------------");
		}
		
		System.out.println("Total Energy Consumption: " + totalUsage + " kWh");
		
	}
}
