import java.util.*;
public class Assignment3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		int[] arr2=new int[n];
		System.out.println("Enter array values");
		int i,sum=0;
		for(i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<arr2.length;i++) {
		sum= sum+arr2[i];
		}
		System.out.println("sum of array elements  :"+sum);
		}
}
