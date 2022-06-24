package arrays;

public class Assignment4 {
	public static void main(String args[]){
		int[] n= new int[] {15,21,12,30};
		int sum=0;
		for (int i=0;i<n.length;i++)
		sum=sum+n[i];
		double average=sum/n.length;
		System.out.println("Average value is:"+average);
	}

}
