package a4;

import java.util.Scanner;
public class Asd {
public static void main(String[] args)
{
int[] numArray = new int[5];
int i;
@SuppressWarnings("resource")
Scanner input =new Scanner(System.in);
System.out.print("Enter the 5 Array Elements : ");
for(i=0; i<5; i++)
numArray[i]=input.nextInt(); //Read number
for(i=0; i<numArray.length; i++)
System.out.println("Array element[" + i + "] : " +numArray[i]);
}



}