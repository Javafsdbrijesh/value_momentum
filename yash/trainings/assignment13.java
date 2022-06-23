package trainings;

public class assignment13 {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("hello i'm yashwanth ");
		a.append("how are you ? ");
		System.out.println(a);
		String b="welcome";
		System.out.println(b.replace('c','L'));
		System.out.println(a.delete(5, 14));
		StringBuilder d= new StringBuilder("hey, welcome to java");
		a.append("language ?");
		System.out.println(d);
		String e="welcome";
		System.out.println(e.replace('m','L'));
		System.out.println(d.delete(5, 14));

	}

}
