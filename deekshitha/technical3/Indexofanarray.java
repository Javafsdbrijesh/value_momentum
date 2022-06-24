package technical3;

public class Indexofanarray {

	public static void main(String[] args)
	{
		int[]a=new int[] {10,20,30,40};
		int num=40;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println(i);
			}
		}
	}
}