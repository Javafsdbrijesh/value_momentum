package asntwenty;

import java.util.List;
import java.util.Arrays;
public class Asntwenty {

	public static void main(String[] args) {
List<String> name=Arrays.asList("john","Sweety","anu","Sanju","hari","null");
name.stream().filter(n->n!=null).forEach((n)->System.out.println(n));
name.stream().filter(n->n.startsWith("a")).forEach((n)->System.out.println("startswith a:"+n));
name.stream().filter(n->n.contains("n")).forEach((n)->System.out.println("contains n:"+n));
		
	}
}
