import java.util.Scanner;

public class Remove {
	public static void main(String args[])
	{
	int [] a =new int[] {2,3,4,5,6};
	Scanner sc= new Scanner(System.in);
	int k=sc.nextInt();
	int t=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==k)
		{
			t=i+1;
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(i>=t)
		{
			a[i-1]=a[i];
		}
	}
	for(int i=0;i<a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	}

}
