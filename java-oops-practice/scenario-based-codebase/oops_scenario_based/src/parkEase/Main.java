package parkEase;


public class Main {
    public static void main(String[] args) {
        ParkingManager cityPark = new ParkingManager();

        //  Initialize Slots
        cityPark.addSlot(new ParkingSlot("A1", "Bike"));
        cityPark.addSlot(new ParkingSlot("B1", "Car"));
        cityPark.addSlot(new ParkingSlot("C1", "Truck"));

        // Incoming Vehicles
        Vehicle myBike = new Bike("BR31-AB-3445");
        Vehicle deliveryTruck = new Truck("BR-31-GR-2502");

        // System Processing
        cityPark.parkVehicle(myBike, 3);
        cityPark.parkVehicle(deliveryTruck, 6); // Includes truck penalty

        //Admin Logs
        cityPark.showPublicLogs();
        
    }
}
