//Assignment 4: Write a Java program to calculate the average value of array elements.

public class Assignment4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {18,17,32,31,10,7};
		double average=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			average=sum/a.length;
		}
		System.out.println("Total average of the given array is: "+average);
	}
}
