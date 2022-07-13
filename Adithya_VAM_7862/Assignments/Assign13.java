package jun1517;
//Assignment 13: Create Sring builder and String buffer implementations(append, replace,delete methods).
public class Assign13 {
	public static void main(String[]args) {
		StringBuilder sb=new StringBuilder("First");
		sb.append(" append");
		System.out.println(sb);
		sb.insert(1,"Secondinsert");//1 will be index value
		System.out.println(sb);
		sb.replace(1, 3, "Third");
		System.out.println(sb);
		sb.delete(0,4);
		System.out.println(sb);
		StringBuffer n=new StringBuffer("hello");
		n.append("appended");
		System.out.println(n);
		n.replace(1, 2, "f");
		System.out.println(n);
		n.reverse();
		System.out.println(n);
		n.delete(0, 5);
		System.out.println(n);
	}
}
