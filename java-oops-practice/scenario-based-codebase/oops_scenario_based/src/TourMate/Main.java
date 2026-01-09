package TourMate;

public class Main {
    public static void main(String[] args) {
        //  Create Services (Internal Costs)
        Service flight = new Service("Indigo Flight", 5000.0);
        Service hotel = new Service("Taj Stay", 12000.0);
        Service tour = new Service("City Sightseeing", 3000.0);

        //  Generate Trip Package (Domestic)
        Trip myTrip = new DomesticTrip("Goa", 4, flight, hotel, tour);

        System.out.println("==============================================");
        System.out.println("           WELCOME TO TOUR-MATE PLANNER       ");
        System.out.println("==============================================");

        //  Polymorphic Booking
        myTrip.book();

        // Budget Calculation using Operators
        System.out.printf("\nItinerary for: %s%n", myTrip.getDestination());
        System.out.printf("Total Budget Required: Rs. %.2f%n", myTrip.calculateTotalBudget());
        
        System.out.println("==============================================");
    }
}
