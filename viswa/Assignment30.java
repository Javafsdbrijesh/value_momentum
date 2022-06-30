import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment30 {
	  public static void main(String[] args) {
	        
	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:MM:ss");
	      LocalDateTime current = LocalDateTime.now();
	      String sdt = current.format(formatter);
	      System.out.println(sdt);
	    }

}
