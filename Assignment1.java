Assignment 1: We have an array of 5 elements ({2,3,4,5,6}). Write a program to access values of each element.
Import java.util.Scanner;
public class ArrayElements
{
public static void main(string []args)
{
Int[] numArray = new int[5];
Int i;
Scanner input=new Scanner(System.in);
System.out.print(“Enter elements in an array:”);
for(i=0;i<5;i++)
numArray[i]=input.nextlnt();
for(i=0; i<numArray.length;i++)
System.out.println(“Array elements are(“+i+”):”+numArray(i);
}
}
