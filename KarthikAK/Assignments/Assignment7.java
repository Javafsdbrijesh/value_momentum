/*Write a Java program to remove a specific element from an array.*/

package Assignments;

import java.util.Arrays;

public class Assignment7 {
	public static int findIndex(int arr[], int t) {
		if(arr == null) {
			return -1;
		}
		int len = arr.length;
		int i = 0;
		while(i < len) {
			if(arr[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr1[] = {7,11,13,14,19,20,54};
		int key = 7;
		int abc = findIndex(arr1, key);
		if(abc >= 0) {
			int copy[] = new int[arr1.length - 1];
			for(int i = 0, j = 0; i < arr1.length; i++) {
				if(i != abc) {
					copy[j++] = arr1[i];
				}
			}
			System.out.println(Arrays.toString(copy));
		} else {
			System.out.println("Not exists");
		}
	}

}
