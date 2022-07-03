package jun1517;

import java.util.Arrays;

//Assignment 2: Write a java program to sort a numeric array and String Array.
public class Second {
	public static void main(String[]args) {
		int a[]= {2,4,1,5,6};
		/*Arrays.sort(a);
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}*/
		int i=0;
		while(i<a.length) {
			int j=i+1;
			while(j<a.length) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j+=1;
			}
			i+=1;
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
	}
}
