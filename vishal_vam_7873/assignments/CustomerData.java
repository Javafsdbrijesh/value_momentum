package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerData {
	
	public static List<CustomerFL>getAll(){
		 return Stream.of(
	                new CustomerFL(1, "Anil", "anil@gmail.com", Arrays.asList("9869656965", "7865985232")),
	                new CustomerFL(2, "Arvind", "arving@gmail.com", Arrays.asList("9356895665", "8965321456")),
	                new CustomerFL(3, "Deekshitha", "deekshitha@gmail.com", Arrays.asList("8754213265", "9936256658"))
	                ).collect(Collectors.toList());
		
	}

}
