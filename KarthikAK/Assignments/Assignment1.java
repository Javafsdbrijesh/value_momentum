/*We have an array of 5 elements ({2,3,4,5,6}). Write a prgm to access values of each element.*/

package Assignments;

import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 elements of an array: ");
		for(i = 0; i < 5; i++)
			arr[i] = s.nextInt();
		for(i = 0; i < arr.length; i++)
			System.out.println("Array element[" + i + "]: " + arr[i]);
	}

}
