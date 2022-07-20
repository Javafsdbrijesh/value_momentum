package advjava5;
import java.util.*;
public class IntegerList {
public static void main(String []args) {
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(30);
	list1.add(60);
	list1.add(70);
	list1.add(100);
	list1.stream().forEach((temp) -> System.out.println(temp));
}
}
