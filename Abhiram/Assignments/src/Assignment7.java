//Assignment 7: Write a Java program to remove a specific element from an array.

import java.util.*; 
public class Assignment7 {
public static void main(String[] args) {
   int a[] = {17,32,18,7,175,333,10,1};
   System.out.println("Original Array : "+Arrays.toString(a));     
   int removeIndex = 1;
   for(int i = removeIndex; i < a.length -1; i++){
        a[i] = a[i + 1];
      }
    System.out.println("After removing the second element: "+Arrays.toString(a));
 }
 }