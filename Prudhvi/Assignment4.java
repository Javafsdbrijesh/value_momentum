
public class Assignment4 {
	public static void main(String []args) {
		int[] arr2= {23,45,56,12,34};
		int i,sum=0;
		float avg = 0;
		for(i=0;i<arr2.length;i++) {
			sum= sum+arr2[i];
			 avg=sum/(arr2.length);
		}
		System.out.println(avg);
	}

}
