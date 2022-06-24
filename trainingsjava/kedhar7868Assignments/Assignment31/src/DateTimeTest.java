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


        //Print specified date
        LocalDate republicDay = LocalDate.of(1950, 1, 26);
        System.out.println("Our Republic day is: " + republicDay);

        

    }
}