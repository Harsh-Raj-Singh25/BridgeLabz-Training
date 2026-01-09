package TourMate;

class DomesticTrip extends Trip {
    public DomesticTrip(String dest, int days, Service t, Service h, Service a) {
        super(dest, days, t, h, a);
    }

    @Override
    public void book() {
        // POLYMORPHISM: Simple booking logic
        System.out.println("Booking Domestic Trip to " + getDestination());
        System.out.println("Status: Confirmed via Aadhaar/ID Verification.");
    }

    @Override
    public void cancel() {
        System.out.println("Domestic booking cancelled. 90% refund initiated.");
    }
}

