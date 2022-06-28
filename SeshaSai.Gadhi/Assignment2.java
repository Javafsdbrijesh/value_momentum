package javaTraining;

import java.util.Arrays;

public class Assignment2 {
	static int a[]= {3,5,1,4,2};
	static String s[]= {"a","g","d","c","b","f"};
	void display()
	{
         Arrays.sort(a);
         for(int i=0;i<a.length;i++)
         {
         System.out.println(a[i]);
         }
	}
	void execute()
	{
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	}
	public static void main(String []sai)
	{
		Assignment2 a2=new Assignment2();
		a2.display();
		a2.execute();
	}
	

}
