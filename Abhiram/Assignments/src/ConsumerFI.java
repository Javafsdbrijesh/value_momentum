//Assignment 17: Implement Consumer Functional Interface, traditionally and using lambda expressions, and show custom implementation as well using list.

import java.util.*;
public class ConsumerFI {

//	@Override
//	public void accept(Integer t) {
		// TODO Auto-generated method stub
	//	System.out.println("consumer implementation integer: "+t);
//	}
		
//		public static void main(String []args) {
//			Consumer<Integer> a = new ConsumerFI();
//			a.accept(5);
			
	//with lambda expression
	public static void main(String []args) {
//		Consumer<Integer> a = (t) -> System.out.println("consumer implementation integer: "+t);
//		a.accept(6);
	
	List<Integer> b = Arrays.asList(1,22,33,44);
	b.stream().forEach((t) -> System.out.println("consumer implementation Arraylist "+t));
	}
}