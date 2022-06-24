package advjava;

import java.util.Arrays;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,6,3,10,30,20,11,4};
		int Index_position=3;
		int newvalue=9;
		System.out.println("Original array:"+Arrays.toString(arr));
		for(int i=arr.length-1;i>Index_position;i--)
		{
		arr[i]=arr[i-1];
		}
		arr[Index_position]=newvalue;
		System.out.println("New array:"+Arrays.toString(arr));

	}

}
