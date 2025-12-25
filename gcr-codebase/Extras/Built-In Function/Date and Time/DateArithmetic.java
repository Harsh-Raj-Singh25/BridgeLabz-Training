import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Converting input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Adding 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        updatedDate = updatedDate.minusWeeks(3);

        // Displaying result
        System.out.println("calculations: " + updatedDate);
    }
}