package Basics1;

import java.util.Arrays;
public class Sorting {
	public static void main(String []args) {
		int[] a =new int[] {12,10,8,9,3,4};
		Arrays.sort(a);
		System.out.println("The ascending order of arra elements : ");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
