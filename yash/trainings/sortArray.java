//sorting or arrays and string. assignment 2
package trainings;
import java.util.Arrays;
public class sortArray {

	public static void main(String[] args) {
		int[] a= {4,7,2,65,678,234};
		String b[] = {"a","g","d","c","b","i"};
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("the sorted array is: ");
		for(int num:a) {
			System.out.println(num+ " ");
		}
		System.out.println("sorted string is:\n"+Arrays.toString(b));
		

	}

}
