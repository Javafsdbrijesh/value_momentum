package javaTraining;

public class Assignment5 {
	int a[]=new int[7];
	static int n=22;
	Assignment5()
	{
		super();
		int a[]= {11,45,325,65,2,5,22};
		
		}
	public void indicate()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("array cointains a specific value"+a[i] +"found at location "+i);
			}
		}
	}
	public static void main(String args[])
			{
		Assignment5 a7=new Assignment5();
		a7.indicate();
		
			}
}
