//Assignment 8: Insert an element {9} into array at 3rd index.
//int[] testArray = new int[]{2,1,6,3,10,30,20,11,4};

import java.util.*; 
public class Assignment8 {
public static void main(String[] args) {
	int a[] = new int[]{2,1,6,3,10,30,20,11,4};
	int Index_position = 3;
	int newValue    = 9;
	System.out.println("Original Array : "+Arrays.toString(a)); 
	for(int i=a.length-1; i > Index_position; i--){
    a[i] = a[i-1];
   }
   a[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(a));
 }
 }