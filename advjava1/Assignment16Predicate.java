package advjava4;
import java.util.function.Predicate; 
public class Assignment16Predicate{
  static Boolean TestAge(int age) {
	  if(age>17)
		  return true;
	  else 
		  return false;
  }
public static void main(String[] args) {
        Predicate<Integer> predicate = Assignment16Predicate::TestAge;
        boolean result = predicate.test(25);
        System.out.println(result);
 

      
}
 
}
