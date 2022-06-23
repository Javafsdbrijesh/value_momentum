//Assignment 2: Write a java program to sort a numeric array and String Array.

import java.util.*;
public class Assignment2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {17,7,32,18,10,31,333};        
	    String[] a2 = {"a","g","d","c","b","f"};  
	    System.out.println("numeric array : "+Arrays.toString(a1));
	    Arrays.sort(a1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(a1));
	    System.out.println("string array : "+Arrays.toString(a2));
	    Arrays.sort(a2);
	    System.out.println("Sorted string array : "+Arrays.toString(a2));
	}
}
