package jun2022;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.LocalTime;
import java.time.ZoneId;



public class Assign33 {
public static void main(String[] args) {



LocalDate localDate = LocalDate.parse("2017-02-03");
LocalTime localTime = LocalTime.parse("12:30:30");
ZonedDateTime date = ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault());
System.out.println(date);
}
}