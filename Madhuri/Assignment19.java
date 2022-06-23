import java.util.ArrayList;
import java.util.List;

public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		 list1.stream() .filter(num -> num % 2 == 0) .forEach(System.out::println);
		 list1.stream() .filter(num -> num > 2) .forEach(System.out::println);
	}

}
