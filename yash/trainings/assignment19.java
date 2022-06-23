package trainings;

import java.util.List;
import java.util.Arrays;

public class assignment19 {

	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(10,20,30,45,55,23,22);
		mylist.stream()
		.filter(n->n%2==0)//lambda o expression
		.filter(n->n%3==0)
		.filter(n->n%5==0)
		.forEach(System.out::println);

	}

}
