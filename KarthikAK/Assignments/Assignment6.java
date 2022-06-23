/*Write a Java program to find the index of an array element.*/

package Assignments;

public class Assignment6 {
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
		System.out.println("Index position of 7 is: " + findIndex(arr1, 7));
		System.out.println("Index position of 5 is: " + findIndex(arr1, 5));
	}

}
