package technical3;

import java.util.Arrays;

public class Removeanelement {
public static void main(String[] args)
		{
			int arr[]= {10,2,17,22,31};
			System.out.println("Original array:"+Arrays.toString(arr));
			int removeIndex=1;
			for(int i=removeIndex;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			System.out.println("after removing the second element:"+Arrays.toString(arr));
		}
	}