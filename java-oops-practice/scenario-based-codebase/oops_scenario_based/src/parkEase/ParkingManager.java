package parkEase;

import java.util.ArrayList;
import java.util.List;

class ParkingManager {
    private List<ParkingSlot> slots = new ArrayList<>();
    private List<String> privateLogs = new ArrayList<>(); // Private record

    public void addSlot(ParkingSlot slot) { slots.add(slot); }

    public void parkVehicle(Vehicle v, int hours) {
        for (ParkingSlot slot : slots) {
            // Check if slot is empty and matches vehicle type
            if (!slot.isOccupied() && slot.getVehicleTypeAllowed().equals(v.getType())) {
                slot.occupy();
                double fee = v.calculateCharges(hours);
                
                String log = "Vehicle: " + v.getLicensePlate() + " | Slot: " + slot.getSlotId() + " | Fee: Rs. " + fee;
                privateLogs.add(log); // Protected update
                
                System.out.println( v.getType() + " parked successfully.");
                System.out.println("Receipt Generated: Rs. " + fee);
                return;
            }
        }
        System.out.println(" No available slots for " + v.getType());
    }

    public void showPublicLogs() {
        System.out.println("\n--- ParkEase Daily Activity Logs ---");
        for (String log : privateLogs) {
            System.out.println(log);
        }
    }
}

