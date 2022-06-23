//removing the element in array; assignment 7
package trainings;
import java.util.Arrays;
public class removeelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,2,34,54,345};
		System.out.println("original Array:"+Arrays.toString(arr));
		int removeIndex=1;
		for(int i=removeIndex;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("after removing the second element:"+Arrays.toString(arr));
	}

}
