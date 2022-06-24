import java.util.Arrays;
import java.util.List;

public class Predict {



// @Override
// public boolean test(Integer t) {
// if(t%2 == 0) {
// return true;
// }else {

// return false;
// }
// }
public static void main(String []args) {
// Predicate<Integer> a = new PredicateFI();
// System.out.println(a.test(8));
// Predicate<Integer> a = (t) -> t% 2 ==0;
// System.out.println(a.test(7));
List<Integer> b = Arrays.asList(45,34,2,6,8,11,90,342,223);
b.stream().filter((t) -> t%2 == 0).forEach(t -> System.out.println("Predicate numbers are : " + t));


}
}