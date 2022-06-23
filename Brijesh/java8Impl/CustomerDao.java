package java8Impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {

	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(1, "Anil", "anil@gmail.com", Arrays.asList("9869656965", "7865985232")),
				new Customer(2, "Arvind", "arving@gmail.com", Arrays.asList("9356895665", "8965321456")),
				new Customer(3, "Deekshitha", "deekshitha@gmail.com", Arrays.asList("8754213265", "9936256658"))
				).collect(Collectors.toList());
		
		
		// List<String> phonenumbersCust1  = {"3432423423","324324324234"}
		// List<String> phonenumbersCust2  = {"3437423423","324324234242"}
		// List<String> phonenumbersCust3  = {"3432343423","324324334234"}
		
		// List<List<String>> phonenumberOfAllCustomers = {{"3432423423","324324324234"}, {"3437423423","324324234242"}, {"3432343423","324324334234"}}
		//List<String> listOfPhoneNumber = {"3432423423","324324324234", "3437423423","324324234242", "3432343423","324324334234"}
		
	}
}
