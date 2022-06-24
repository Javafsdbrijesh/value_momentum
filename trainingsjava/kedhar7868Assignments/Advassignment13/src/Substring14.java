
public class Substring14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="valuemomentum";
		System.out.println(s1.substring(6,11));
	}
}
/**
 * Java String class provides the built-in substring()
 *  method that extract a substring from the given string 
 *  by using the index values passed as an argument 
 *  INDEX starts at 0
 *  
 *  If the original string is very long, and has array of size 1GB,
 *   no matter how small a substring is, it will hold 1GB array.  
 *   This will also stop original string to be garbage collected, 
 *   in case if doesn't have any live reference. This is a clear case of
 *    memory leak in Java, where memory is retained even if it's not 
 *    required. That's how substring method creates memory leak.
 * */
	


