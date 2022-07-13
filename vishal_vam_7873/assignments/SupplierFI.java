package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SupplierFI {

//	@Override
//	public String get() {
		// TODO Auto-generated method stub
//		return "Supplier code is executed";
//	}
	public static void main(String[] args) {
//		Supplier<String> a1 = new SupplierFI();
//		System.out.println(a1.get());
		
		Supplier<String> a2 = () -> "Supplier code is executed";
		System.out.println(a2.get());
		
		List<String> a3 = Arrays.asList();
		System.out.println(a3.stream().findAny().orElseGet(() -> "Noting is presented in List "));
	}
	

}
