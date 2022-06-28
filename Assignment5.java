import java.util.*;
public class Assignment5 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array values");
		int i;
		int c=0;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the specific value");
		int num=sc.nextInt();
		for(i=0;i<n;i++) {
			if(arr[i]==num) c+=1;
		}
		if(c==1)
				System.out.println("YES");
			else
				System.out.println("NO");	
		
}
}
