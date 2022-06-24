package a32;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class a32 
{
public static void main(String[] args) {
LocalDateTime now=LocalDateTime.now();
String format =now.format(DateTimeFormatter.ofPattern("MM/d (ss)"));
System.out.println(format);
}
}