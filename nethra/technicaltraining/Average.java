package technicaltraining;

public class Average {
	public static void main(String[] args)
	{
		int[]n=new int[] {12,13,15,20,22};
		int sum=0;
		for(int i =0;i<n.length;i++)
		sum=sum+n[i];
		double average=sum/n.length;
		System.out.println("Average value is:" +average);
	}
	
}
