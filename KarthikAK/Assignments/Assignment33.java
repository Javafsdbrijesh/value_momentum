/*Print current zone(use now method of ZonedDateTime)*/

package Assignments;
import java.time.*;
public class Assignment33 
{

	public static void main(String[] args) 
	{
		// create a clock
		ZoneId zid = ZoneId.of("Europe/Paris");
		ZonedDateTime dt = ZonedDateTime.now(zid);
		System.out.println("ZonedDateTime is: " + dt);
	}

}
