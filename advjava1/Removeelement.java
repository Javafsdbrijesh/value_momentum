package advjava1;
import java.util.Arrays;
public class Removeelement {

	public static void main(String[] args) {
		int[] arr= {10,11,23,46,78};
		System.out.println("original array:"+Arrays.toString(arr));
		int removeIndex=1;
		for(int i=removeIndex;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println("after removing the second element:"+Arrays.toString(arr));

	}

}
