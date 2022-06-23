package java8Impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaFSD {
	public static void main(String[] args)
	{
		// Get the List
		List<String> list = Arrays.asList("java", "full", "stack");

		// Collect the list as map
		// by groupingBy() method
		Map<String, Long> result
		= list.stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print the result
		System.out.println(result);
	}
}
