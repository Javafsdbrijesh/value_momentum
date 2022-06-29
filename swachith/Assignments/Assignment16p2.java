package swachith;

import java.util.*;
public class Assignment16p2 {
	// @Override
	// public boolean test(Integer t) {
	// if(t%2 == 0) {
	// return true;
	// } else {
	// return false;
	// }
	// }




	//Predicate<Integer> predicate = (t) -> t%2 == 0;

	public static void main(String[] args) {
	//Predicate<Integer> predicate = new PredicateImpl();
	//System.out.println(predicate.test(3));



	//<Integer> predicate = (t) -> t%2 == 0;
	//System.out.println(predicate.test(11));




	List<Integer> list = Arrays.asList(1,2,3,4,5,6,8, 9,7,11);
	list.stream().filter((t) -> t%2 == 0).forEach(t -> System.out.println("Printing : " + t));
	}

}