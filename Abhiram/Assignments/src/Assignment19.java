//Assignment 19: Create a Integer List and perform list traversal.

import java.util.*;
public class Assignment19 {
	public static void main(String []args) {
		List<Integer> b = Arrays.asList(11,22,33,44,8,9,10);
		Collections.sort(b);
		System.out.println("Ascending order: "+b);
		b.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));
	}
}
