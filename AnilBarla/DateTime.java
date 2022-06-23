package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime {
	public static void main(String[] args) {
		
//Assignment 27		
		System.out.println("Current Date");
		LocalDate a = LocalDate.now();
		System.out.println(a);
		
//Assignment 28
		System.out.println("\nCurrent Time: ");
		LocalTime b = LocalTime.now();
		System.out.println(b);
		
//Assignment 29
		System.out.println("\nDate and Time :");
		LocalDateTime c = LocalDateTime.now();
		System.out.println(c);
		
//Assignment 30
		System.out.println("\nDateTime in a particular format: ");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String formatedDateTime = current.format(formatter);
        System.out.println( formatedDateTime);
		
//Assignment 31
        System.out.println("\nPrint specified date: ");
        LocalDate f = LocalDate.of(2001, 3, 28);
        System.out.println("It's My Birthday: " + f);
        
  //Assignment 32
        System.out.println("\nThe Month Day and seconds: ");
        Month g = a.getMonth();
        int day = a.getDayOfMonth();
        int seconds = b.getSecond();
        System.out.println("Month: "+g+", Day: "+day+", Seconds: "+seconds);
        
 //Assignment 33
        System.out.println("\nThe current zone");
        ZonedDateTime zone = c.atZone(ZoneId.of("GMT+10"));
        System.out.println(zone);
		
	}
	

}
