import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment28to34 {
	public static void main(String[] args) {
		
//Assignment 28: Find current Date.	
		System.out.println("Current Date");
		LocalDate a = LocalDate.now();
		System.out.println(a);
		
//Assignment 29: Find current Time.
		System.out.println("\nCurrent Time: ");
		LocalTime b = LocalTime.now();
		System.out.println(b);
		
//Assignment 30: Find current DateTime.
		System.out.println("\nDate and Time :");
		LocalDateTime c = LocalDateTime.now();
		System.out.println(c);
		
//Assignment 31: Print Date in a particular format.
		System.out.println("\nDateTime in a particular format: ");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String formatedDateTime = current.format(formatter);
        System.out.println( formatedDateTime);
		
//Assignment 32: Print specified date.
        System.out.println("\nPrint specified date: ");
        LocalDate f = LocalDate.of(2001, 3, 20);
        System.out.println("It's My Birthday: " + f);
        
  //Assignment 33: Print Months day and seconds.
        System.out.println("\nThe Month Day and seconds: ");
        Month g = a.getMonth();
        int day = a.getDayOfMonth();
        int seconds = b.getSecond();
        System.out.println("Month: "+g+", Day: "+day+", Seconds: "+seconds);
        
 //Assignment 34: Print the current zone (use now method of ZonedDateTime).
        System.out.println("\nThe current zone");
        ZonedDateTime zone = c.atZone(ZoneId.of("GMT+10"));
        System.out.println(zone);
		
	}
	

}