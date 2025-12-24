import java.util.*;
// program to display calendar for a given month and year
public class Calendar {
	// methods:
    // month name from month number
    public static String getMonthName(int m) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[m - 1];
    }
	// check if leap year
    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
	// get days in month
    public static int getDaysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y))
            return 29;
        return days[m - 1];
    }
	// get first day of the month
    public static int getFirstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        // basic validation for month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            sc.close();
            return;
        }

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(1, month, year);
        int days = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++)
            System.out.printf("%4s", "");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
        sc.close();
    }
}
