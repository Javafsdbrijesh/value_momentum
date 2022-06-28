import java.util.Scanner;

public class Assignment4 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array values");
		int i,sum=0,avg = 0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++) {
		sum= sum+arr[i];
		avg=sum/(arr.length);
		}
		System.out.println("Avarage of array elements :"+avg);
		}
}
