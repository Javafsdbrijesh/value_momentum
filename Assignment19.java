import java.util.*;
public class Assignment19 {
	public static void main(String sai[])
	{
	List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	l.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
	System.out.println("");
	l.stream().filter(n -> n >5).forEach(System.out::print);
	System.out.println("");



	l.stream().filter(n -> n % 2 == 0).filter(n -> n % 3 == 0).forEach(System.out::print);
	}
}