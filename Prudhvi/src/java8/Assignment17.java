package java8;

import java.util.HashMap;
import java.util.Map;

public class Assignment17 {
	public static void main(String []args) {
		Map<Integer, String> map =new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.forEach((key,value)-> System.out.println(key +":"+value));
		map.entrySet().stream().forEach(x -> System.out.println(x));
	}

}
