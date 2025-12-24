import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        // Create a formatter for readable output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        //  GMT (Greenwich Mean Time)
        // You can use "GMT", "UTC", or "Etc/GMT"
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        
        // IST (Indian Standard Time)
        // Use the official region ID "Asia/Kolkata" for reliable results
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // PST (Pacific Standard Time)
        // Use "America/Los_Angeles" which follows PST/PDT rules
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display results
        System.out.println("GMT Time: " + gmtTime.format(formatter));
        System.out.println("IST Time: " + istTime.format(formatter));
        System.out.println("PST Time: " + pstTime.format(formatter));
    }
}
