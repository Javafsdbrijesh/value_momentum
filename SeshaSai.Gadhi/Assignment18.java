package java;
import java.util.*;
public class Assignment18 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.stream().forEach((temp)->System.out.println(temp));
	
}
}