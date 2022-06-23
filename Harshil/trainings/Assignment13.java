package trainings;
public class Assignment13 {
	public static void main(String []args) {
		StringBuffer a = new StringBuffer("Hello I'm Harshil ");
		a.append("How are you ? ");
		System.out.println(a);
		String b = "Welcome ";
		System.out.println(b.replace('c' , 'L'));
		System.out.println(a.delete(5 , 14));

		StringBuilder d = new StringBuilder("Hey, Welcome to Java ");
		a.append("Language ? ");
		System.out.println(d);
		String e = "Welcome ";
		System.out.println(e.replace('m' , 'L'));
		System.out.println(d.delete(5 , 14));
		}
		}

