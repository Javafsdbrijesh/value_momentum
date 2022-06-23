import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class assingment30 {

	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		String format =now.format(DateTimeFormatter.ofPattern("MM d yyyy"));
		String format2 =now.format(DateTimeFormatter.ofPattern("d MM yyyy"));
		System.out.println(format);
		System.out.println(format2);


	}

}
