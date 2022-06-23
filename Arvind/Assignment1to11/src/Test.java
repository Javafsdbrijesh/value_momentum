import java.util.Scanner;

public class Test {
	public static void main(String args[])
	{
		int count=0;
		int [] a =new int[] {2,3,4,5,6};
		Scanner sc= new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				System.out.println("found");
				break;
			}
			count++;
		}
		if(count==a.length)
		System.out.println("not found");
		
	}

}
