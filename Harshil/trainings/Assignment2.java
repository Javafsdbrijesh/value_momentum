package trainings;
import java.util.Arrays;
public class Assignment2 {
	public static void main(String args[])
	{
	int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
	String arr1[] = { "a", "s", "d" };
	Arrays.sort(arr);
	Arrays.sort(arr1);
	System.out.println("The sorted array is: ");
	for (int num : arr) {
	System.out.print(num + " ");
	}
	System.out.println("\nSorted String is :\n " + Arrays.toString(arr1));
	}
	}


