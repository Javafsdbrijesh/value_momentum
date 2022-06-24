package a18;

import java.util.*;
public class a18 {
public static void main(String[] args) {
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.stream().forEach((temp)->System.out.println(temp));
	
}
}
