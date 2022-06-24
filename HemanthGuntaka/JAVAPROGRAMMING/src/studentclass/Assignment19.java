package studentclass;
import java.util.List;
import java.util.Arrays;
public class Assignment19 {
	public static void main(String[]args)
	{
		List<Integer> list=Arrays.asList(10,20,30,45,55,23,22);
		list.stream()
		.filter(n->n%2==0)
		.filter(n->n%3==0)
		.filter(n->n%5==0)
		.forEach(System.out::println);
		
	}

}
