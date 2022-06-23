/**/

package Assignments;
import java.util.ArrayList;
import java.util.List;

public class Assignment20 {

	public static void main(String[] args) {
		List<String> versions = new ArrayList<>();
		versions.add("My name is AK");
		versions.add("I'm from GITAM University, Hyderabad");
		versions.add("I'm from department of CSE");
		versions.add("My CGPA is 8.06");
		System.out.println("Length greater than 10");
		versions.stream().filter(s -> s.length() > 10).forEach(System.out::println);
		System.out.println("First element which has letter 'M'");
		String first = versions.stream().filter(s -> s.contains("e")).findFirst().get();
		System.out.println(first);
		
		// Using multiple filter
		System.out.println("Length greater than 5 and starts with 'I'");
		versions.stream().filter(s -> s.length() > 8).filter(s -> s.startsWith("I")).forEach(System.out::print);
	}

}
