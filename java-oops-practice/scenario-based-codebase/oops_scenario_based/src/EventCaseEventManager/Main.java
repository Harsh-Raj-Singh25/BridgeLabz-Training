package EventCaseEventManager;
import java.util.*;
public class Main {
	public static void main(String [] args) {
		Event events[]= {
			new Birthday("Hajipur","20/12/2026","BIR-H",120,1000,5000 ),
			new Birthday("Samastipur","01/12/2026","BIR-S",50,750,4000),
			new Conference("Patna","25/12/2026","CON-P",5000,10000,55000),
			new Conference("Muzzafarpur","10/11/2026","CON-M",3500,3000,25000)
		};
		Scanner sc=new Scanner(System.in);
		
		for(Event e: events) {
			System.out.println("-----Welcome to EventEase---------");
			System.out.println("==================================");
			e.schedule();   // schedule the event
			System.out.println( );
			e.reschedule("25/01/2027");// reschedule the event to a new date
			System.out.println( );
			e.cancel();// cancel the event
			
			System.out.println("----------------------------------");
			System.out.println("----Thank you for choosing us-----");
			System.out.println("==================================");
			System.out.println();
		}
	}
}
