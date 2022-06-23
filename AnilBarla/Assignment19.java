package Java8;

import java.util.Arrays;
import java.util.List;

public class Assignment19 {
	public static void main(String []args) {
		List<Integer> a = Arrays.asList(2,8,12,23,22,14,15,18,19);
		a.stream().filter((t) -> t%2 == 0).forEach((t) -> System.out.println("Operation 1: "+t));
		
		a.stream().filter((t) -> t.intValue()>=15).forEach((t) -> System.out.println("values greater than 15: "+t));
	}

}
