package javaTraining;

public class Assignment4 {
	static int a[]= {5,3,6,9};
	int sum;
	double d;
	void average()
	{
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		d=(double)sum/a.length;
		System.out.println(d);
	}
	public static void main(String sai[])
			{
		      Assignment4 a4=new Assignment4(); 
		      a4.average();
			}

}
