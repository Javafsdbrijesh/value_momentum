package advjava1;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,15,-8,45,20,5};
		String arr1[]= {"a","g","d","c","b","f"};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println("The sorted array is: ");
		for(int num:arr) {
		System.out.println(num + " ");
		}
		System.out.println("\nSorted String is:\n" +Arrays.toString(arr1));

	}

}
