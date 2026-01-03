package VehicleRentalSystem;

public class Main {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Harsh Raj Singh");

		Rentable[] decRent = { new Car("BR315578", 5000.0, 450.0), new Bike("MP04Ub5578", 4522.0),
				new Truck("Br014585", 8000.0, 2000) };

		int rentDay = 4;

		System.out.println("----------------------");
		System.out.println("--HRS Rental Services--");
		System.out.println("CLient Name:" + customer1.getName());
		System.out.println("Total days" + rentDay);

		double totalBill = 0.0;

		for (Rentable v : decRent) {
			String VehicleType = v.getClass().getSimpleName();
			// double cost = v.calculateRent(rentDay); to use calculateRate function we must
			// be using Rentable type array
			double cost = v.calculateRent(rentDay);

			System.out.printf("%-10s | Rental Cost: Rs. %10.2f%n", VehicleType, cost);
			totalBill += cost;
		}
		
		System.out.println("The total amount payable is -----:" +totalBill);
	}

}
