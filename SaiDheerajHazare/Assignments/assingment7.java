import java.util.Arrays;
public class assingment7 {
	public static void main(String[] args) {
		int a[]= {10,2,34,54,34};
		System.out.println("orginal array: "+Arrays.toString(a));
		int removeindex=3;
		for(int i=removeindex;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
	System.out.println("after removing third element: "+Arrays.toString(a));

}
}
