package technicaltraining;
import java.util.Arrays;
public class Sorting {
	public static void main(String args[])
	{
		int arr[]= {2,-15,8,25,16,49,-20};
		String arr1[]= {"a","g","d","c","b","f"};
		Arrays .sort(arr);
		Arrays.sort(arr1);
		System.out.println("The sorted array is:");
		for(int num:arr) {
			System.out.println(num + " ");
			}
		System.out.println("\nSorted String is:\n" +Arrays.toString(arr1));
		
		
	}
	

}
