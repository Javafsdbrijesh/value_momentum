import java.time.LocalDate;
 
public class Assignment27 {
    /*
     * Old Date time ( java.util.Date )APIs drawback:
     * 1. Not thread safe. 
     * 2. Less/Limited Operation
     * 
     * Feature of new Date Time (java.time) APIS:
     * 1. Thread Safe
     * 2. Immutable
     * 3. Many Operations compared to old API
     * 
     */

    public static void main(String[] args) {

        //current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

    
    }
}