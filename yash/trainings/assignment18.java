package trainings;
import java.util.*;
public class assignment18 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.stream().forEach(
				(temp)->System.out.println(temp));
	}

	}
