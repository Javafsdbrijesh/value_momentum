//Assignment 13: Create Strings using two different ways and check weather their references are equal or not.

public class Assignment13 {
	public static void main(String []args) {
		String a = "hello";
		String c = "hello";
		String b = new String("hello");
		System.out.println(a == b);
		System.out.println(a == c);
		}
}
