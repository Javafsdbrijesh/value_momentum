package jun2022;
import java.time.LocalDate;
//Assignment 30: Print Date in a particular format   
import java.time.format.DateTimeFormatter;
public class Assign30 {
	public static void main(String[]args) {
		LocalDate a=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(a));
		System.out.println(a);
	}
}
