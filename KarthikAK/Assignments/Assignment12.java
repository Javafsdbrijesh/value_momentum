/*Create strings using two diff ways and check whether their references are equal or not.*/

package Assignments;

public class Assignment12 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bcd";
		String s = new String("Morning");
		String ss = new String("Morning");
		System.out.println(s1 == s2);
		System.out.println(s == ss);
		System.out.println(s.equals(ss));
	}

}
