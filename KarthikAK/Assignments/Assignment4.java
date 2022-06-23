/*Write a java prgm to calculate the average value of array elements.*/

package Assignments;

public class Assignment4 {

	public static void main(String[] args) {
		int arr[] = {7, 11, 13, 14, 19, 20, 54};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		double avg = (double) sum / arr.length;
		System.out.println("Average value of array elements is: " + avg);
	}

}
