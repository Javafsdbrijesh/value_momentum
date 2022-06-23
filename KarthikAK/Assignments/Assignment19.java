// Create a Integer List and perform filter operation(2 different filter operations).

package Assignments;
import java.util.List;
import java.util.Arrays;

public class Assignment19 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
		System.out.println("");
		list.stream().filter(n -> n > 5).forEach(System.out::print);
		System.out.println("");
		
		list.stream().filter(n -> n % 2 == 0).filter(n -> n % 3 == 0).forEach(System.out::print);
	}

}
