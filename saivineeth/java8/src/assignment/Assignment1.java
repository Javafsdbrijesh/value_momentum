package assignment;

import java.util.Scanner;
public class Assignment1 {
	  public static void main(String[] args) 
      { 
         int[] num = new int[5]; 
         int i; 
         Scanner in =new Scanner(System.in); 
         System.out.print("Enter the 5 Array Elements : "); 
         for(i=0; i<5; i++) 
              num[i]=in.nextInt();  
         for(i=0; i<num.length; i++) 
             System.out.println("Array element[" + i + "] : " +num[i]); 
       } 

}