package Basics1;

public class AverageArray {
	public static void main(String []args) {
		int a[]=new int[] {2,4,12,45,10};
		int b=0;
		for (int i=0;i<a.length;i++) {
			b = b+a[i];
		}
			double avg = b/a.length;

			System.out.println("The Average value of an array : " + avg );
	}
}
