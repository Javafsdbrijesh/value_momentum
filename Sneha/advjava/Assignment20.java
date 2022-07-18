package advjava1;

import java.util.Arrays;
import java.util.List;

public class Assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<java.lang.String> name=Arrays.asList("john","Sweety","anu","Sanju","hari","null");
		name.stream().filter(n->n!=null).forEach((n)->System.out.println(n));
		name.stream().filter(n->n.startsWith("a")).forEach((n)->System.out.println("startsWith a:"+n));
		name.stream().filter(n->n.contains("n")).forEach((n)->System.out.println("contains n:"+n));

	}

}
