/*Write a java program to sort a numeric array and string array*/

package Assignments;
import java.util.Arrays;
public class Assignment2 {

	public static void main(String[] args) {
		int arr[] = {7,20,14,54,19,11,13};
		String s[] = {"k","v","a","s","m","r","n"};
		Arrays.sort(arr);
		Arrays.sort(s);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(s));
	}

}