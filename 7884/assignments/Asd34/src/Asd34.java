import java.time.*;
public class Asd34 {
public static void main(String[] args)
{
// create a clock
ZoneId zid = ZoneId.of("Europe/Paris");
ZonedDateTime lt
= ZonedDateTime.now(zid);
System.out.println("ZonedDateTime : " + lt);
}
}