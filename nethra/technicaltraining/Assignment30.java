package technicaltraining;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment30 
{
	public static void main(String[] args) {
		//Print in a particular format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		LocalDateTime current = LocalDateTime.now();
		String formatedDateTime = current.format(formatter);
		System.out.println("The local formated date and time is: " + formatedDateTime);
		}
		}

