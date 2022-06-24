package advjava;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
