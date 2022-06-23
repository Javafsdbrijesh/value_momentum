

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeTest {


    public static void main(String[] args) {
    	
    	 //Print Months day and seconds
    	
        LocalDateTime current = LocalDateTime.now();
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Current -" + " Month: " + month + " Day: " + day + " Seconds: " + seconds);

    }
}
