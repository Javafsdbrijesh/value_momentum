
public class Assignment13 {
	public static void main(String []arg) {
		StringBuffer st =new StringBuffer("hello java");
		st.append("welcome");
		st.insert(5, "o");
		st.delete(0, 1);
		System.out.println(st);
		StringBuilder str =new StringBuilder("my name is prudhvi");
		str.append("+gopi");
		str.insert(9, "o");
		str.delete(3, 8);
		System.out.println(str);
	}

}
