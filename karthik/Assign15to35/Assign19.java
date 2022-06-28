package jun2022;
import java.util.*;
//Assignment 19: Create a Interegr List and perform filter operation(2 different filter operations).
public class Assign19 {
	public static void main(String[]args) {
		List<Integer> a=Arrays.asList(1,4,6,7,8,10,40,50);
		a.stream()
		.filter(n->n%2==0)
		.filter(n->n%3==0)
		.forEach(System.out::println);
	}
}
