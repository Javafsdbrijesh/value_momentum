package advjava1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-dd-MM HH:mm:ss");
	       LocalDateTime current = LocalDateTime.now();
	       String formatedDateTime = current.format(formatter);
	       System.out.println("The local formated date and time is: " + formatedDateTime);

	}

}
