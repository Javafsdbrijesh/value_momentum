import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment32 {

	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		String format =now.format(DateTimeFormatter.ofPattern("MM/d  (mm)"));
		System.out.println(format);

	}

}