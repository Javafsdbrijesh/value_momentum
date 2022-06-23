// Create a map<Integer, String> and traverse over the map elements.

package Assignments;
import java.util.*;
public class Assignment17 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String> (); //implements map interface
		hm.put(1, "AK");
		hm.put(2, "LUCIFER");
		hm.put(3, "BOB");
		hm.put(4, "BOBBY");
		hm.put(5, "RED");
		Iterator<Integer> it = hm.keySet().iterator(); //keyset is a method
		while(it.hasNext()) {
			int key = (int)it.next();
			System.out.println("Roll Number: " + key + " Name: " + hm.get(key));
		}
	}

}
