package javaTraining;

public class Assignment3 {
	static int a[]= {5,3,6,4};
	int sum;
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	public static void main(String sai[])
			{
		      Assignment3 a3=new Assignment3(); 
		      a3.display();
			}
	

}
