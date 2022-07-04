import java.util.Arrays;
public class Numbers {
	public static void main(String[] args)
	{
		int []arr = {6,3,5,1,9,24};
		String []arr1= {"r","o","h","i","t","k"};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println("Sorted integers are " + Arrays.toString(arr));
		System.out.println("Sorted String is " +Arrays.toString(arr1));
	    }
	}