//Assignment 3: Write a Java program to sum values of an array.


public class SumOfValuesOfAnArray 
{
public static void main(String []args) 
{
int[] arr2= {23,45,56,12,34,78};
int i,sum=0;
for(i=0;i<arr2.length;i++) {
sum= sum+arr2[i];
}
System.out.println(sum);
}



}