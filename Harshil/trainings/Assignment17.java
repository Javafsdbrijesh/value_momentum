package trainings;
import java.util.HashMap;
import java.util.Map;
	public class Assignment17 {
		public static void main(String []args) {

		Map<Integer , String> a = new HashMap<Integer , String>();
		a.put(1, "First key");
		a.put(2, "Second key");
		a.put(5, "Fifth key");
		a.put(8, "Final key");
		a.forEach((key , value) -> System.out.println(key + " : "+ value));
		}
}
