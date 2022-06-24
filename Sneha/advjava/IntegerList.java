package advjava1;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(30);
		list1.add(60);
		list1.add(70);
		list1.add(100);
		list1.stream().forEach((temp) -> System.out.println(temp));

	}

}
