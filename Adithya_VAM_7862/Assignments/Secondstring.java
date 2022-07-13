package jun1517;

import java.util.Arrays;
//Assignment 2: Write a java program to sort a String Array.
public class Secondstring {
	public static void main(String[]args) {
		//String k="this is karthik";
		String []a= {"a","x","c","y"};//k.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
