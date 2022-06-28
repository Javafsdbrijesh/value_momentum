
//Assignment 1: We have an array of 5 elements ({2,3,4,5,6}). Write a program to access values of each element.

import java.util.Scanner;
public class AccessValue
{
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




