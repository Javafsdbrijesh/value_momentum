//Assignment 3: Write a Java program to sum values of an array.

public class Assignment3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {18,17,32,333,7,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of elements in an array is: "+sum);
	}
}
