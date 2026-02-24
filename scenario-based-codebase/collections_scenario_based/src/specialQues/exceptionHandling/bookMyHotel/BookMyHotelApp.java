package specialQues.exceptionHandling.bookMyHotel;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate; 

public class BookMyHotelApp {
	public static void main(String[] args) throws IOException, InvalidBookingDetailsException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the Booking portal");
		System.out.println("Enter  name ");
		String name=br.readLine();
		System.out.println("Enter age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter email [johndoe@example.com]");
		String email=br.readLine();
		System.out.println("Enter credit card number [16 digits]");
		
		String credit=br.readLine(); 
		HotelBooking.validateUserDetails(age, email, credit);
		
		System.out.println("Enter hotel name:");
		String hotel=br.readLine();
		System.out.println("Select room type [Standard,Deluxe,Suite]");
		String room=br.readLine();
		System.out.println("Enter checkIn date(yyyy-MM-dd):");
//		String in=br.readLine();
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate checkIn=LocalDate.parse(br.readLine());
		System.out.println(" Enter checkOut date [yyyy-MM-dd]");
		LocalDate checkOut=LocalDate.parse(br.readLine());
		HotelBooking.validateBookingDetails(hotel, room, checkIn, checkOut);
		
		System.out.println(" BreakFast included [true/false]??");
		boolean isBreakFast=Boolean.parseBoolean(br.readLine());
		HotelBooking.calculateBookingCost(room, age, isBreakFast);
	}
}
