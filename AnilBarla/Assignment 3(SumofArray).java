package Basics1;

public class SumofArray {
	public static void main(String []args) {
		int a[]=new int[] {2,4,12,45,10};
		int b=0;
		for (int i=0;i<a.length;i++) {
			b = b+a[i];
		}
		System.out.println("The sum  values of array : " + b);
	}
}

