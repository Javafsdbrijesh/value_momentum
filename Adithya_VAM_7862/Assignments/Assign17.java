package jun2022;
import java.util.*;
//Assignment 17: Create a map<Integer, String> and traverse over the map elements.
public class Assign17 {
	public static void main(String[]args) {
		Map<Integer, String> f=new HashMap<Integer, String>();
		f.put(5,"JaVA");
		f.put(7, "FULLSTACK");
		System.out.println(f);
		f.forEach((a,b)->System.out.println("Number"+(a+2)+"Training"+b));
	}
}
