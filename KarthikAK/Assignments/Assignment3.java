/*Write a java program to sum values of an array.*/

package Assignments;

public class Assignment3 {

	public static void main(String[] args) {
		int arr[] = {7, 11, 13, 14, 19, 20, 54};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		System.out.println("Sum of all elements of the array: " + sum);
	}

}
