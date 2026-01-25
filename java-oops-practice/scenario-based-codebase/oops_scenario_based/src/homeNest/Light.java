package homeNest;

public class Light extends Device implements IControllable {
	Light(String id, String status, double usage){
		super(id, status, usage);
	}

	public void turnOn() {
		// TODO Auto-generated method stub
		if(getStatus().equalsIgnoreCase("off")) {
			setStatus("ON");
			System.out.println("Light turned on");
		}else {
//			setStatus("OFF");
			System.out.println(" Light already onn");
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(getStatus().equalsIgnoreCase("off")) {
			System.out.println("Already turned off !!!");
		}else{
			setStatus("OFF");
			System.out.println(" Light turned off ");
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		System.out.println("Light's Energy usage reset ..");
		this.energyUsage=0;
	}
}
