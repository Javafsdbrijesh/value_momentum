
//Assignment 12: Create Strings using two different ways and check weather their references are equal or not

public class StringsToCheckReferenceEqualorNot {
	public static void main(String []arg) {
		String s ="hello";
		String s2 ="hello";
		String s1 = new String("hello");
		String s3 = new String("hello");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s1==s3);
		}



		}