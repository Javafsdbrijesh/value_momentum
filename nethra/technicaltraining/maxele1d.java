package technicaltraining;
import java.util.Arrays;

public class maxele1d {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,100};
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("largest in the given array is"+max);
	}
}
