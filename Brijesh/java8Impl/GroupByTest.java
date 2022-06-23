package java8Impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByTest {
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple","orange", "apple", "banana", "papaya", "apple","banana","orange");
		
		Map<String, Long> fruitbasket = 
				fruits.stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Fruits in our fruit basket : "+ fruitbasket);
		
	}
	
	// stream()
	// forEach()
	// sorted()
	// Collections.sort()
	// Collections.reverse()
	// filter()
	// Collect()
	// distinct
	// map() 
	// reduce
	// ifPresent
	// groupingBy()
	// orElseGet()

}
