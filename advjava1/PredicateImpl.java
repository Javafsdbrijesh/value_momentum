package advjava4;
import java.util.function.Predicate; 
public class PredicateImpl {
  static Boolean TestAge(int age) {
	  if(age>17)
		  return true;
	  else 
		  return false;
  }
public static void main(String[] args) {
        Predicate<Integer> predicate = PredicateImpl::TestAge;
        boolean result = predicate.test(25);
        System.out.println(result);
 

      
}
 
}
