
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c=new int[] {4,5,8,9,10};
		int sum=0,n;
		double avg;
		n=c.length;
		for(int i=0;i<c.length;i++)
		{
			sum=sum+c[i];
		}
		
		avg=(double)sum/n;
		System.out.println(avg);


	}

}
