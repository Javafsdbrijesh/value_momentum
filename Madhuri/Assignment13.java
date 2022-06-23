
public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("hello java string buffer");
		System.out.println(s1);
		s1.append(" welcome");
		System.out.println(s1);
		s1.replace(6, 8, "bc");
		System.out.println(s1);
		s1.delete(0, 4);
		System.out.println(s1);
		StringBuilder s2=new StringBuilder("hello java string builder");
		System.out.println(s2);
		s2.append(" welcome");
		System.out.println(s2);
		s2.replace(6, 8, "bc");
		System.out.println(s2);
		s2.delete(0, 4);
		System.out.println(s2);
		

	}

}
