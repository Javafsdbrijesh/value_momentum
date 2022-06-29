package advjava6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment30 {
   
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-dd-MM HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        String formatedDateTime = current.format(formatter);
        System.out.println("The local formated date and time is: " + formatedDateTime);

        
    }
}