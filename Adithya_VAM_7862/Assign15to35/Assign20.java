package jun2022;

import java.util.Arrays;
import java.util.List;

//Assignment 20: Create a List of String and perform filter operation (3 different operations)
public class Assign20 {
	public static void main(String[]args) {
		List<String> f=Arrays.asList("arts","bash","cash","dash");
		f.stream().filter(t->t.startsWith("a")).forEach(x-> System.out.println("Start with a"+x));
		f.stream().filter(t->t.endsWith("h")).forEach(x-> System.out.println("ends with h"+x));
	}
}
