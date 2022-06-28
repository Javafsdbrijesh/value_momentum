package javaTraining;

public class Assignment8 {
	int a[]=new int[10];
	
	Assignment8()
	{
	int a[]= {2,1,6,3,10,30,20,11,4};
	}
		
	
 public void display()
 {
	 for(int i=0;i< a.length;i++)
	 {
		if(i==3)
		{
			a[i]=9;
		}
		System.out.println(a[i]);
	 }
 }
}
 class Demo
{
	public static void main(String[]sai)
	{
		Assignment8 a8=new Assignment8();
		a8.display();
	}
}
