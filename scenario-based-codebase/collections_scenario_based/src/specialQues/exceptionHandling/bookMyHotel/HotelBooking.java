package specialQues.exceptionHandling.bookMyHotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class HotelBooking {
	// method 1 :
	public static void validateUserDetails(int age, String email, String creditCard)
			throws InvalidBookingDetailsException {
		final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		if (age < 18 && age > 100) {
			throw new InvalidBookingDetailsException("User Must be between 18 and 100 ");
		} else if (creditCard.length() != 16) {
			throw new InvalidBookingDetailsException("Invalid credit card number");
		} else if (!Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE).matcher(email).matches()) {
			throw new InvalidBookingDetailsException("Invalid email");
		} else {
			System.out.println("User details Valid details");
		}
	}

	// method 2
	public static void validateBookingDetails(String hotelname, String roomType, LocalDate checkInDate,
			LocalDate checkOutDate) throws InvalidBookingDetailsException {
		String[] hotels = { "HRS", "Khapre", "Chandelas", "Singh", "Thakur" };

		if (!(roomType.equalsIgnoreCase("Standard") || roomType.equals("Deluxe")
				|| roomType.equalsIgnoreCase("Suite"))) {
			throw new InvalidBookingDetailsException("Invalid room type");
		}

//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		try {
//			
//		}
		if (checkInDate == null || !checkInDate.isAfter(LocalDate.now())) {
			throw new InvalidBookingDetailsException("Invalid check-in date");
		}
		if (checkOutDate == null || !checkOutDate.isAfter(checkInDate)) {
			throw new InvalidBookingDetailsException("Invalid check-out date");
		}
		for(String s: hotels) {
			if(s.equalsIgnoreCase(hotelname)) {
				System.out.println(" Hotel details verified");
			}
		}
		
		if(!(hotelname.equalsIgnoreCase("Khapre")|| hotelname.equalsIgnoreCase("thakur"))) {
		    throw new InvalidBookingDetailsException("Invalid hotel name");
		}
	}

	// 3.
	public static void calculateBookingCost(String roomType, int numNights, boolean breakFastIncluded) {
		double totalCost = 0.0;
		if (roomType.equals("Standard")) {
			totalCost += 1000 * numNights;
		} else if (roomType.equals("Deluxe")) {
			totalCost += 2000 * numNights;
		} else if (roomType.equals("Suite")) {
			totalCost += 3000 * numNights;
		}
		if (breakFastIncluded) {
			totalCost += 100;
		}
		System.out.println("Total Bill :" + totalCost);
	}
}
