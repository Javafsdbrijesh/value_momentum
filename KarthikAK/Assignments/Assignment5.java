/*Write a Java program to test if an array contains a specific value.*/

package Assignments;

public class Assignment5 {
	public static boolean findelement(int arr[], int t) {
		if(arr == null) {
			return false;
		}
		int len = arr.length;
		int i = 0;
		while(i < len) {
			if(arr[i] == t) {
				return true;
			} else {
				i = i + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr1[] = {7, 11, 13, 14, 19, 20, 54};
		int key = 54;
		boolean result = findelement(arr1, key);
		if(result == true)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

}
