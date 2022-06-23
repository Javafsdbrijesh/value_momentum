package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerImpl {
	public static void main(String[] args) {
		List<CustomerFL> a =CustomerData.getAll();
		
		List<String> email = a.stream().map(x -> x.getEmail()).collect(Collectors.toList());
		System.out.println("Emails of Customers: "+email );
		
		System.out.println("\n------------------");
		
//Using FlatMap
		List<String> phoneNumbers = a.stream().flatMap(x -> x.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("Customer Phone numbers using Flat Map: " + phoneNumbers);
        
        
        System.out.println("\n------------------");
        
 //Using Map
        
        
        List<List<String>> customerPhoneNumber = a.stream().map(p->p.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("Customer phone numbers using Map: " + customerPhoneNumber);
		
	}

}
