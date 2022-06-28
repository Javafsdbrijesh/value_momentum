package jun2022;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
 
public class DateTimeTest {
    /*
     * Old Date time ( java.util.Date )APIs drawback:
     * 1. Not thread safe. 
     * 2. Less/Limited Operation
     * 
     * Feature of new Date Time (java.time) APIS:
     * 1. Thread Safe
     * 2. Immutable
     * 3. Many Operations compared to old API
     * 
     */

    public static void main(String[] args) {

        //current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        //current time
        LocalTime time = LocalTime.now();
        System.out.println("The current time is: " + time);

        //Current time and date
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("The local date and time is: " + dateTime);

        //Print in a particular format        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String formatedDateTime = current.format(formatter);
        System.out.println("The local formated date and time is: " + formatedDateTime);

        //Print specified date
        LocalDate republicDay = LocalDate.of(1950, 1, 26);
        System.out.println("Our Republic day is: " + republicDay);

        //Print Months day and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Current -" + " Month: " + month + " Day: " + day + " Seconds: " + seconds);

    }
}
