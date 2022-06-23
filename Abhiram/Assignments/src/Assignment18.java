//Assignment 18: Create a map<Integer, String> and traverse over the map elements.

import java.util.*;
public class Assignment18 {
	public static void main(String []args) {
		Map<Integer , String> a = new HashMap<Integer , String>();
		a.put(1, "First key");
		a.put(2, "Second key");
		a.put(5, "Fifth key");
		a.put(8, "Final key");
		a.forEach((key , value) -> System.out.println(key + " : "+ value));
	}
}

