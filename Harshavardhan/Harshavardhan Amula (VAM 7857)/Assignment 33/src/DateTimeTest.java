
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeTest {
  
    public static void main(String[] args)
    {
    	LocalDate localDate = LocalDate.parse("2011-10-02");
        LocalTime localTime = LocalTime.parse("14:45:30");
        ZonedDateTime date = ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault());
        System.out.println(date);  
    }
}