package swachith;

import java.util.*;
public class Assignment16p3 {
	// @Override
	// public String get() {
	// return "Hi Java Supplier! ";
	// }

	public static void main(String[] args) {
	//Supplier<String> supplier = new SupplierImpl();
	//System.out.println(supplier.get());




	//Supplier<String> supplier = () -> "Hi Java Supplier! ";
	//System.out.println(supplier.get());



	List<String> list = Arrays.asList("b");
	System.out.println(list.stream().findAny().orElseGet(() -> "Since data is not present in list, I am printing this."));
	}

}