import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
}
}
