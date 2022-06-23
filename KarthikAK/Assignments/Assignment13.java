/*Create string builder and string buffer implementations(append, replace, delete methods.)*/

package Assignments;

public class Assignment13 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("My name is AK.");
		StringBuilder sb2 = new StringBuilder(" I'm from Hyderabad");
		System.out.println(sb1.append(sb2));
		System.out.println(sb1.replace(3, 3, "good "));
		System.out.println(sb1.delete(3, 5));
		
		StringBuffer s1 = new StringBuffer("Hi, Good morning");
		StringBuffer s2 = new StringBuffer(" Good night");
		System.out.println(s1.append(s2));
		System.out.println(s1.replace(0, 8, "Bad "));
		System.out.println(s1.delete(0, 2));
	}

}
