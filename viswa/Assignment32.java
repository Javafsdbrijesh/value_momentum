import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Assignment32 {

public static void main(String[] args) {

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
LocalDateTime current = LocalDateTime.now();
String formatedDateTime = current.format(formatter);
System.out.println( formatedDateTime);

Month month = current.getMonth();
int day = current.getDayOfMonth();
int seconds = current.getSecond();
System.out.println("Current -" + " Month: " + month + " Day: " + day + " Seconds: " + seconds);

}
}