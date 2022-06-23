//Assignment 20: Create a Integer List and perform filter operation(2 different filter operations).

import java.util.Arrays;
import java.util.List;
public class Assignment20 {
	public static void main(String []args) {
	List<Integer> a = Arrays.asList(12,23,22,14,15,18,19);
	a.stream().filter((t) -> t%2 == 0).forEach((t) -> System.out.println("Operation 1: "+t));
	a.stream().filter((t) -> t%3 == 0).forEach((t) -> System.out.println("Operation 2: "+t));
	}
	}