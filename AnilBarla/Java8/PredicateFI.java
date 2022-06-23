package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFI {

//	@Override
//	public boolean test(Integer t) {
//		if(t%2 == 0) {
//			return true;
//		}else {
		
//		return false;
//		}
//	}
		public static void main(String []args) {
//			Predicate<Integer> a = new PredicateFI();
//			System.out.println(a.test(8));
//			Predicate<Integer> a = (t) -> t% 2 ==0;
//			System.out.println(a.test(7));
			List<Integer> b = Arrays.asList(11,22,33,44,8,9,10);
			b.stream().filter((t) -> t%2 == 0).forEach(t -> System.out.println("Predicate numbers are : " + t));
			
			
		}
	}
