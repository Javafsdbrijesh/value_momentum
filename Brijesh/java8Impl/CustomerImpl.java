package java8Impl;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerImpl {
	/* map() is used for ---------  transformation 
	 * flatMap() is used for -----  transformation    +  flaterring ;
	 * flatmap = map + flaterring;
	 * 
	 * */
	
	public static void main(String[] args) {
		List<Customer>  customer = CustomerDao.getAll();
		
		// Transformed value from List<Customer> to List<String> 
		customer.stream().forEach(System.out::println);
		System.out.println("\n ------------------ ");
		
		List<String> customerEmails = customer.stream().map( e -> e.getEmail()).collect(Collectors.toList());
		System.out.println("List of Customer Email: " + customerEmails);
		
		List<String> customerName = customer.stream().map(c->c.getName()).collect(Collectors.toList());
		System.out.println("List of Customers: " + customerName);
		
		System.out.println("\n ------------------ ");
		
		List<List<String>> customerPhoneNumber =  customer.stream().map(p->p.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println("Customer phone numbers using Map: " + customerPhoneNumber);
		
		List<String> phoneNumbers = customer.stream().flatMap(x -> x.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println("Cusromer Phone numbers using Flat Map: " + phoneNumbers);
	}

}
