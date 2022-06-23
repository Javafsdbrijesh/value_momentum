//adding new element in index position; assignment 8
package trainings;
//adding new element to the existing array elements at index position;assignment 8
import java.util.Arrays;
public class addindex {

	public static void main(String[] args) {
		int[] arr={2,1,6,3,10,30,20,11,4};
		int Index_position=2;
		int newValue=9;
		System.out.println("original Array:"+Arrays.toString(arr));
		for(int i=arr.length-1;i>Index_position;i--) {
			arr[i]=arr[i-1];
		}
		arr[Index_position]=newValue;
		System.out.println("new Array:"+Arrays.toString(arr));
		
		
	
		

	}

}
