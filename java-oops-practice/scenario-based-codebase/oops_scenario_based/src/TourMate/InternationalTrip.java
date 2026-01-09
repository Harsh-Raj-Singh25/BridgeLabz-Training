package TourMate;

class InternationalTrip extends Trip {
    private String visaStatus;

    public InternationalTrip(String dest, int days, Service t, Service h, Service a) {
        super(dest, days, t, h, a);
        this.visaStatus = "REQUIRED";
    }

    @Override
    public void book() {
        // POLYMORPHISM: Complex booking logic with Visa check
        System.out.println("Booking International Trip to " + getDestination());
        System.out.println("Warning: Please ensure Visa status is " + visaStatus);
        System.out.println("Status: Pending Passport Verification.");
    }

    @Override
    public void cancel() {
        System.out.println("International booking cancelled. Standard 70% refund applied.");
    }
}