import java.util.Arrays;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,6,2,8,10,4,9,13};
		int new_index=3;
		int new_value=9;
		for(int i=a.length-1;i>new_index;i--)
		{
			a[i]=a[i-1];
			
		}
		a[new_index]=new_value;
		System.out.println(Arrays.toString(a));

	}

}
