package stringb;
import java.lang.*;

public class Stringbuilder {
	public static void main(String []args) {
System.out.println("Using String Buffer");
StringBuffer a = new StringBuffer("Hello I'm Saivineeth ");
a.append("How are you ? ");
System.out.println(a);
String b  = "Welcome ";
System.out.println(b.replace('c' , 'L'));
System.out.println(a.delete(5 , 14));
        
        
System.out.println("\nUsing String Builder");
StringBuilder d = new StringBuilder("Hey, Welcome to Java ");
a.append("Language ? ");
System.out.println(d);
String e = "Welcome ";
System.out.println(e.replace('m' , 'L'));
System.out.println(d.delete(5 , 14));
	}
	
}


