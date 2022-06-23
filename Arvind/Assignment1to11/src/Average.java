
public class Average {
	public static void main(String args[])
	{
		int sum=0;
		int [] a =new int[] {2,3,7,5,6};
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);
	}

}
