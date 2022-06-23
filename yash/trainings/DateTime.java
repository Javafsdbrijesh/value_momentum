package trainings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
 
public class DateTime {

    public static void main(String[] args) {

        //for current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        //for current time
        LocalTime time = LocalTime.now();
        System.out.println("The current time is: " + time);

        //for Current time and date
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("The local date and time is: " + dateTime);

        //Print in a particular format        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String formatedDateTime = current.format(formatter);
        System.out.println("The local formated date and time is: " + formatedDateTime);

        //Print specified date
        LocalDate mybirthday = LocalDate.of(2000, 4, 22);
        System.out.println("my birthday is: " + mybirthday);

        //Print Months day and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Current -" + " Month: " + month + " Day: " + day + " Seconds: " + seconds);

    }
}