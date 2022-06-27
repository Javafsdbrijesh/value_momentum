package advjava5;
import java.util.Map;
import java.util.HashMap;
public class Mapelements {
public static void main(String []args) {
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "hello");
	map.put(2,"valuemomentum");
	map.forEach((k,v)-> System.out.println("Number"+k+",training: "+v));
}
}
