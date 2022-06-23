package trainings;
import java.util.Arrays;
public class RemoveSpecific {
	public static void main(String []args) {
		int[] a=new int[] {12,10,11,2,21};
		System.out.println("Original Array : " +Arrays.toString(a));
		int[] c = new int[a.length-1];
		int b = 1;
		for(int i=b;i<c.length-1;i++) {
		a[i] = a[i+1];
		}
		System.out.println("After removing the specific element: "+Arrays.toString(a));
		}
		}


