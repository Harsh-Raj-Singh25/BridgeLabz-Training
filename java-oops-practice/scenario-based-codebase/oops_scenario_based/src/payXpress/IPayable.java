package payXpress;

import java.util.*;

//Interface for Payment and Notification
interface IPayable {
	void pay(double amountPaid);

	void sendReminder();
}



