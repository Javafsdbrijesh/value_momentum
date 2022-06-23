package trainings;
import java.util.Map;
import java.util.HashMap;
public class assignment17 {

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(1,"yashwanth");
		map.put(2,"value momentum");
		map.put(3,"hyderabad");
		map.forEach((k,v)->System.out.println("Number " +k+", training: "+v));

	}

}
