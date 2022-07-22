package assignment;

import java.util.Arrays;

public class Assignment567 {

	public static boolean contains(int []intArray,int num) {
		for(int ta : intArray) {
			if(num == ta) {
				return true;
			}
		}
		return false;
	}
	public static int findIndex(int arr[],int t) {
		int len=arr.length;
		int i=0;
		while(i<len) {
			if(arr[i]==t) {
				return i;
			}
			else {
				i=i+1;
			}
		}
		return -i;
	}
		public static int[] removeTheElement(int[]ta,int index) {
			int[] arry = new int[ta.length-1];
			for(int i1=0,k=0;i1<ta.length;i1++) {
				if(i1==index) {
					continue;
				}
				arry[k++]=ta[i1];
			}
			return arry;
		}
	public static void main(String []args) {
		int []ta =new int[]{2,1,8,3,10,30};
		int index=2;
		System.out.println(contains(ta,100));
		System.out.println(findIndex(ta,10));
		ta=removeTheElement(ta,index);
		System.out.println(Arrays.toString(ta));
	}

}