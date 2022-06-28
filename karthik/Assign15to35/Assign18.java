package jun2022;
//Assignment 18: Create a Integer List and perform list traversal.
import java.util.*;
public class Assign18 {
	public static void main(String[]args) {
		List<Integer> h=new ArrayList<Integer>();
		h.add(1);
		h.add(72);
		h.add(3);
		h.forEach((x)->System.out.println("Hi"+(x*3)));
	}
}
