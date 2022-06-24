package advjava1;

import java.util.HashMap;
import java.util.Map;

public class MapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hello");
		map.put(2,"valuemomentum");
		map.forEach((k,v)-> System.out.println("Number"+k+",training: "+v));

	}

}
