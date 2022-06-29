package swachith;

public class Assignment4 {

	public static void main(String[] args) {
		int[] arravg= {21,43,76,22,34,78};
		int i,sum=0,avg = 0;
	
		for(i=0;i<arravg.length;i++)
		{
		sum= sum+arravg[i];
		avg=sum/(arravg.length);
		}
		
		System.out.println("Average: "+avg);

	}

}
