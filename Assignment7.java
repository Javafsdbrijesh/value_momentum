import java.util.*;
public class Assignment7 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N value");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter array values");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the element which you want to remove");
	int removeIndex =sc.nextInt();
	for(int i = removeIndex; i < arr.length -1; i++){
       arr[i] = arr[i + 1];
      }
	System.out.println("After removing the  element: "+Arrays.toString(arr));
	}
}

