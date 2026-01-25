package homeNest;

public class Lock extends Device implements IControllable {
	Lock(String id, String status, double usage){
		super(id, status, usage);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if(getStatus().equalsIgnoreCase("off")) {
			setStatus("ON");
			System.out.println("Lock turned on");
		}else {
			System.out.println(" Lock already onn");
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(getStatus().equalsIgnoreCase("off")) {
			System.out.println("Already turned off !!!");
		}else{
			setStatus("OFF");
			System.out.println(" Lock turned off ");
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.energyUsage=0;
		System.out.println(" Lock's energy usage reset");
	}
}

