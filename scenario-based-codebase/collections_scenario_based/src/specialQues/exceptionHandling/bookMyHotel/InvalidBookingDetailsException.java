package specialQues.exceptionHandling.bookMyHotel;

@SuppressWarnings("serial")
public class InvalidBookingDetailsException extends Exception {
	public InvalidBookingDetailsException(String message){
		super(message);
	}
}
